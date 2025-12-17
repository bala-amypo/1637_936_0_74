package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRespositry;

import org.springframework.stereotype.Respository;

import com.example.demo.entity.StudentEntity;

@Repository 
public interface StudentRepository extends JpaRespositry StudentEntity.Integer>{

  
}