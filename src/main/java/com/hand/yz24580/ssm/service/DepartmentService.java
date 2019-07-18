package com.hand.yz24580.ssm.service;

import com.hand.yz24580.ssm.mapper.DepartmentMapper;
import com.hand.yz24580.ssm.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;

	public List<Department> getDepts() {
		// TODO Auto-generated method stub
		List<Department> list = departmentMapper.getAllDepartments();
		return list;
	}

}
