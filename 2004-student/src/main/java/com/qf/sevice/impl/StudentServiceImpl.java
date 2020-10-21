package com.qf.sevice.impl;

import com.qf.dao.StudentDao;
import com.qf.dao.StudentRespository;
import com.qf.sevice.StudentService;
import com.qf.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
@Autowired
    StudentDao studentDao;

    @Override
    public List<student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public student findById(int id) {
        return studentDao.findById(id);
    }

    @Override
    public String delete(int id) {
        Integer delete = studentDao.delete(id);
        if(delete==1){
            return "success";
        }
        return "fail";
    }
}
