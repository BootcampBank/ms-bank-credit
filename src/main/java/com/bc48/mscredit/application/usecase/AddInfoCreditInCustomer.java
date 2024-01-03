package com.bc48.mscredit.application.usecase;

import com.bc48.mscredit.domain.dtos.CreditDto;
import com.bc48.mscredit.domain.dtos.CustomerDto;

public interface AddInfoCreditInCustomer {

  CustomerDto addInfoInCustomer(CreditDto creditDto);
}
