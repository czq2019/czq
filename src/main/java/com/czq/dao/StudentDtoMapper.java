package com.czq.dao;



import com.czq.dto.StudentDto;

public interface StudentDtoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentDto record);

    int insertSelective(StudentDto record);

    StudentDto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentDto record);

    int updateByPrimaryKey(StudentDto record);
}