package com.qf.dao;

import com.qf.student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {
    List<student> findAll();

    student findById(int id);

    Integer delete(int id);
}
