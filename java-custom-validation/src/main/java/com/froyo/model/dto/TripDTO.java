package com.froyo.model.dto;

import com.froyo.customvalidation.constraints.AirlineConstraint;
import jakarta.validation.constraints.NotNull;

public class TripDTO {

    @NotNull
    @AirlineConstraint
    private String airline;

    public TripDTO(String airline) {
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "TripDTO(airline=" + this.airline + ")";
    }
}
