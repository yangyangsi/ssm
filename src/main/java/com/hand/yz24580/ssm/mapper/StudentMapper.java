package com.hand.yz24580.ssm.mapper;


import com.hand.yz24580.ssm.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> getAllStudent();
    void InsertStudent(Student student);
}
