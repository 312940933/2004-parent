package com.qf.client;

import com.qf.student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class StudentFallBackMethod implements StudentClient {
    @Override
    public List<student> findAll() {
        System.out.println("findAll降级");
        return null;
    }

    @Override
    public student findById(Map map) {
        return null;
    }

    @Override
    public String delete(Map map) {
        return null;
    }

    @Override
    public String addAndUpdate(student stu) {
        return null;
    }
}
