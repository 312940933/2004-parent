package com.qf.sevice;

import com.qf.student;

import java.util.List;

public interface StudentService {
    List<student> findAll();

    student findById(int id);

    String delete(int id);


}
