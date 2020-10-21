package com.qf.dao;

import com.qf.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<student,Integer> {
}
