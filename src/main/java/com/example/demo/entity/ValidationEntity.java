package com.example.demo.Entity;
import jakarta.persistence.Entity;

@Entity
public class ValidationEntity{
    @Id
    @GenerateValue(stratergy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=30,message="must be 2 to 10 character")
    private String username;
    private String email;
    private String password;
    private Int age;
}