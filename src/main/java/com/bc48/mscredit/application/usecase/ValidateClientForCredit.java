package com.bc48.mscredit.application.usecase;

import com.bc48.mscredit.infrastructure.imputport.WebClientService;
import com.bc48.mscredit.domain.dtos.CreditDto;
import com.bc48.mscredit.domain.dtos.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ValidateClientForCredit implements ValidateForCreditService {
  @Value("${URI_CUSTOMERSERVICE_GETBYID}")
  String URI_CUSTOMERSERVICE_GETBYID;
  @Autowired
  WebClientService webClientService;
  @Override
  public Mono<Boolean> validateClient(CreditDto creditDto) {

    String clientId = creditDto.getCustomerId();

    Mono<CustomerDto> customerDtoMono =
        webClientService.getFromExternalService(URI_CUSTOMERSERVICE_GETBYID, clientId);

    return customerDtoMono.flatMap(customer -> {
      if ("PERSONAL".equals(customer.getClientType())) {

        return validatePersonalClient(customer);
      } else if ("BUSINESS".equals(customer.getClientType())) {
        return validateBusinessClient();
      } else {
        // Otros tipos de cliente o manejo de errores
        return Mono.just(false);
      }
    });
  }

  private Mono<Boolean> validatePersonalClient(CustomerDto customer) {
    return Mono.just(customer.getLoans().isEmpty());
  }

  private Mono<Boolean> validateBusinessClient() {
    return Mono.just(true); // Permitir la creación de créditos para clientes empresariales
  }


}
