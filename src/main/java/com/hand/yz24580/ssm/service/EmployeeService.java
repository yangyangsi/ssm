package com.hand.yz24580.ssm.service;

import com.hand.yz24580.ssm.mapper.EmployeeMapper;
import com.hand.yz24580.ssm.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeMapper employeeMapper;

	/**
	 * 查询所有员工
	 * @return
	 */
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeMapper.getAllEmployees();
	}
	/**
	 * 按照员工id查询员工
	 * @param id
	 * @return
	 */
	public Employee getEmp(Integer id) {
		// TODO Auto-generated method stub
		Employee employee = employeeMapper.getEmployeeById(id);
		return employee;
	}

	/**
	 * 检验用户名是否可用
	 *
	 * @param empName
	 * @return  true：代表当前姓名可用   fasle：不可用
	 */
	public boolean checkUser(String empName) {
		// TODO Auto-generated method stub
		List<Employee> employeeList=employeeMapper.getEmployeeByName(empName);
		long count = employeeList.size();
		return count == 0;
	}
	/**
	 * 员工保存
	 * @param employee
	 */
	public void saveEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.insertEmployee(employee);
	}

	/**
	 * 员工删除
	 * @param id
	 */
	public void deleteEmp(Integer id) {
		// TODO Auto-generated method stub
		employeeMapper.deleteEmployeeById(id);
	}

	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		employeeMapper.deleteBatch(ids);
	}

	/**
	 * 员工更新
	 * @param employee
	 */
	public void updateEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.updateEmployee(employee);
	}
}
