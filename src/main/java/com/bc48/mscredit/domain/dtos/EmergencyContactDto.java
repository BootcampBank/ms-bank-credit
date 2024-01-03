package com.bc48.mscredit.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmergencyContactDto {

    private String name;
    private String relationship;
    private String phoneNumber;
}
