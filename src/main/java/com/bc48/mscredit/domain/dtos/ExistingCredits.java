package com.bc48.mscredit.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExistingCredits {
  private String creditId;
  private String creditCardId;
  private String bankAccountID;
  private BigDecimal availableCredit;

}
