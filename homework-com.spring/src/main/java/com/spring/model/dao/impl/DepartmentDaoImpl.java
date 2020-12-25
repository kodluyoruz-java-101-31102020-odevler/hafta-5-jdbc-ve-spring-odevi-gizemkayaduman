package com.spring.model.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.aspect.annotation.MethodRunningTime;
import com.spring.model.dao.DepartmentDao;

@Repository("departmentDaoImpl")
public class DepartmentDaoImpl implements DepartmentDao {
	
	@Override
	@MethodRunningTime( active = true )
	public List<String> getNames() {
		return Arrays.asList("İnsan Kaynakları", "Mühendislik", "Pazarlama");
	}

	
}
