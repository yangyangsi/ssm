package com.hand.ssm.dao;

        import com.hand.ssm.pojo.Student;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface StudentMapper {
    List<Student> getAllStudent();
    void InsertStudent(Student student);
}
