package com.hand.ssm.dao;

        import com.hand.ssm.pojo.Student;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface StudentMapper {
    public List<Student> getAllStudent();
}
