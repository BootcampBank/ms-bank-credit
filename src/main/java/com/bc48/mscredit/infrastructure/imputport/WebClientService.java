package com.bc48.mscredit.infrastructure.imputport;

import com.bc48.mscredit.domain.dtos.CustomerDto;
import reactor.core.publisher.Mono;

public interface WebClientService {
  Mono<CustomerDto> getFromExternalService(String endPoint, String customerId);
  Mono<CustomerDto> addCreditInCustomerService(CustomerDto customerDto , String id , String endpoint);
}
