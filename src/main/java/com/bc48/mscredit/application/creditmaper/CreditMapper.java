package com.bc48.mscredit.application.creditmaper;

import com.bc48.mscredit.domain.documents.Credit;
import com.bc48.mscredit.domain.dtos.CreditDto;
import org.springframework.beans.BeanUtils;

public class CreditMapper {

    private CreditMapper(){
    }
        public static CreditDto entityToDto(Credit credit) {
            CreditDto creditDto = new CreditDto();
            BeanUtils.copyProperties(credit, creditDto);
            return creditDto;
        }

        public static Credit dtoToEntity(CreditDto creditDto) {
            Credit credit = new Credit();
            BeanUtils.copyProperties(creditDto, credit);
            return credit;
        }

        public static Credit updateEntity(Credit credit, CreditDto creditDto) {
            BeanUtils.copyProperties(creditDto, credit);
            return credit;
        }



}

