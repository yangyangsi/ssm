package com.hand.ssm.test;

import com.hand.ssm.pojo.Student;
import com.hand.ssm.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "classpath:mybatis/applicationContext-mybatis.xml", "classpath:mybatis/applicationContext-tx.xml"})
public class StudentTest {
     @Autowired
     private StudentService studentService;
     @Test
     public void testStudentService(){
         List<Student> list=studentService.getAllStudent();
         for(int i=0;i<list.size();i++){
             System.out.println("sno:"+list.get(i).getSno()+"--sname:"+list.get(i).getSname()+"--score:"+list.get(i).getScore());
         }
     }
}
