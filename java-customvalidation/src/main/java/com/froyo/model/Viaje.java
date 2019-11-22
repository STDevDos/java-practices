package com.froyo.model;

import com.froyo.customvalidation.constraints.AerolineaConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Data
public class Viaje {

    @NotNull
    @AerolineaConstraint
    private String aerolinea;

}
