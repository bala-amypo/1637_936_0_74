package com.example.demo.service.Impl;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.example.demo.service.StudentService;
 import com.example.demo.service.StudentEntity;
 
@Service 
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    //save();
    //findAll();
    //findbyId();
    //deleteById();
    //exisById();


    public StudentEntity postData(StudentEntity stu){
        return student.save(stu);

    }

}