package com.froyo.model.dto;

import com.froyo.customvalidation.constraints.AirlineConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Data
public class TripDTO {

    @NotNull
    @AirlineConstraint
    private String airline;

}
