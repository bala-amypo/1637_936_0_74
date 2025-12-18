package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.NotNull;
import jakarta.persistence.Email;

@Entity
public class ValidationEntity{
    @Id
    @GenerateValue(stratergy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=30,message="must be 2 to 10 characterk")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Max(6)
    @NotNull(message = "Passord is mandatory")
    @Max(30)
    private String password;
    @Positive(message ="Age must be a positive number")
    private Int age;
}