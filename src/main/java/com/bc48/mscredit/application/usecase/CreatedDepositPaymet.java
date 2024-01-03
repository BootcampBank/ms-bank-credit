package com.bc48.mscredit.application.usecase;

import com.bc48.mscredit.domain.dtos.DepositAmountDto;
import com.bc48.mscredit.domain.dtos.MovementDto;
import java.time.LocalDate;

public class CreatedDepositPaymet {

   public static DepositAmountDto SetDepositForList(MovementDto movementDto){
     DepositAmountDto depositAmountDto = new DepositAmountDto();
     depositAmountDto.setAmount(movementDto.getAmount());
     depositAmountDto.setAuthorizationCode(movementDto.getAuthorizationCode());
     depositAmountDto.setOriginMovement(movementDto.getOriginMovement());
     depositAmountDto.setDateOfMovement(LocalDate.now());
     depositAmountDto.setMovementId(movementDto.getMovementId());

     return depositAmountDto;
   }
}
