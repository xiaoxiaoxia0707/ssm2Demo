package com.mapper;

import com.pojo.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    List<Student> selectAll();


    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

}