package com.hand.yz24580.ssm.mapper;

import com.hand.yz24580.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Integer id);

    List<Employee> getEmployeeByName(String empName);

    int insertEmployee(Employee employee);

    int deleteEmployeeById(Integer id);

    int deleteBatch(List<Integer> ids);

    int updateEmployee(Employee employee);
}
