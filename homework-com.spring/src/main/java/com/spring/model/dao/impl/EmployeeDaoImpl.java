package com.spring.model.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.aspect.annotation.MethodRunningTime;
import com.spring.model.dao.EmployeeDao;

@Repository("employeeDaoImpl")
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	@MethodRunningTime( active = true )
	public List<String> getNames() {
		
		return Arrays.asList("Ali", "Ahmet", "Ayşe");
	}

}

