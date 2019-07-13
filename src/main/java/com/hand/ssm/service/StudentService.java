package com.hand.ssm.service;

import com.hand.ssm.dao.StudentMapper;
import com.hand.ssm.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    public List<Student> getAllStudent(){
        return studentMapper.getAllStudent();
    }
}
