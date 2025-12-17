package com.example.demo.entity;

import java.sql.Date;
@Entity 
public class StudentEntity{
    private String name;
    private Integer id;
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
    public void setPassword(S)
}