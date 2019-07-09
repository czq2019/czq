package com.czq.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.czq.dao.StudentDtoMapper;

@Service
public class StudentService {

	
	@Resource
	private StudentDtoMapper studentDtoMapper;
}
