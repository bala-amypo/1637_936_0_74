package com.example.demo.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerateValue;
import jakarta.persistence.GenerateType;
import jakarta.persistence.Id;
@Entity 
public class StudentEntity{
    @Id 
    @GenerateValue(stratergy=GenerationType.IDENTITY)
    private String id;
    private String name;
    private String email;
    private Date created;
    public Date getCreated(){
        return created;
    }
    public IntegergetId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public SampleEntity(Integer id,String name,String email,String password,Date created){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.created=created;
    }
    public StudentEntity(){

    }
}