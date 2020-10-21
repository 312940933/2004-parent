package com.qf.sevice.impl;

import com.qf.dao.StudentRespository;
import com.qf.sevice.StuService;
import com.qf.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    StudentRespository studentRespository;
    @Override
    public String saveAndUpdateStudent(student student) {
        student student1 = studentRespository.saveAndFlush(student);
        if(student1==null){
            return "fail";
        }else {
            return "success";
        }

    }
}
