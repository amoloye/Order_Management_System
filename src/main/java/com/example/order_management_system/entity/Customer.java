package com.example.order_management_system.entity;

import lombok.*;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;

    @NotBlank
    private long registrationCode;

    @NotBlank(message = "please input customer first name")
    @Min(3)
    private String firstName;

    @NotBlank(message = "please input surname")
    @Min(3)
    private String surname;

    @NotBlank(message = "please input email address")
    private String email;

    @NotNull(message = "please input telephone number")
    private long telephone;

}
