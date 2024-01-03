package com.bc48.mscredit.application.usecase;

import com.bc48.mscredit.domain.dtos.CreditDto;
import reactor.core.publisher.Mono;

public interface ValidateForCreditService {

   Mono<Boolean> validateClient(CreditDto creditDto);
}
