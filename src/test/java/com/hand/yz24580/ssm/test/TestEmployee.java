package com.hand.yz24580.ssm.test;

import com.hand.yz24580.ssm.mapper.DepartmentMapper;
import com.hand.yz24580.ssm.mapper.EmployeeMapper;
import com.hand.yz24580.ssm.pojo.Department;
import com.hand.yz24580.ssm.pojo.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "classpath:mybatis/applicationContext-mybatis.xml", "classpath:mybatis/applicationContext-tx.xml"})
public class TestEmployee {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void testEmployeeMapper(){
        List<Employee> employeeList=employeeMapper.getAllEmployees();
        for(int i=0;i<employeeList.size();i++){
            System.out.println(employeeList.get(i));
        }
    }

    @Test
    public void testDepartmentMapper(){
        List<Department> departmentList=departmentMapper.getAllDepartments();
        for(int i=0;i<departmentList.size();i++){
            System.out.println(departmentList.get(i));
        }
    }

    @Test
    public  void testById(){
        System.out.println(employeeMapper.getEmployeeByName("李四").get(0));
    }

    @Test
    public void testInsertEmp(){
        Employee employee = new Employee();
        employee.setEmpName("龙发");
        employee.setGender("男");
        employee.setEmail("2131132@qq.com");
        employee.setdId(1);
        System.out.println(employeeMapper.insertEmployee(employee));
    }
    @Test
    public void testDeleteEmp(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        employeeMapper.deleteBatch(list);
    }

    @Test
    public void testUpdate(){
        Employee employee = new Employee();
        employee.setdId(3);
        employee.setEmpName("222");
        employee.setGender("男");
        employee.setEmail("2131132@qq.com");
        employee.setEmpId(16);
        employeeMapper.updateEmployee(employee);
    }
}
