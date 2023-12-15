package com.picpay.picpaysimplificado.dtos;

import java.math.BigDecimal;

import com.picpay.picpaysimplificado.domain.UserType;

public record UserDTO(String firstName, String lastName, String document, String email, String password, BigDecimal balance, UserType userType) {


    
}
