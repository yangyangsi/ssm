package com.hand.yz24580.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.hand.yz24580.ssm.pojo.Student;
import com.hand.yz24580.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ssm")
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getAllStudent")
    public String getAllStudent(){
        PageHelper.startPage(1,3);
        List<Student> list=studentService.getAllStudent();
        for(int i=0;i<list.size();i++){
            System.out.println("sno:"+list.get(i).getSno()+"--sname:"+list.get(i).getSname()+"--score:"+list.get(i).getScore());
        }
        return "helloworld";
    }



    @RequestMapping("/paramTest")
    public String paramTest(){
        return "bootstrap";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getTest(@PathVariable int id){
        System.out.println(id);
        return "www";
    }

    @PostMapping("/{id}")
    @ResponseBody
    public String postTest(@PathVariable int id){
        System.out.println("postpostpost");
        System.out.println(id);
        return "nnn";
    }

    @RequestMapping("/map")
    @ResponseBody
    public Student jackson(){
        Student student=new Student();
        student.setSno(1);
        student.setScore("22");
        student.setSname("里斯");
        return student;
    }
}
