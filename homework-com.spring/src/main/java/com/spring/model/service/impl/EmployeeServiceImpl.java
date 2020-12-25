package com.spring.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.spring.model.dao.EmployeeDao;
import com.spring.model.service.EmployeeService;

@Service("employeeServiceImpl")

@Scope("singleton") 
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<String> getAll(){
		
		return employeeDao.getNames();
	}

}
