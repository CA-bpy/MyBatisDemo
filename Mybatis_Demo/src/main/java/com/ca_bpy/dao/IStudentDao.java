package com.ca_bpy.dao;

import com.ca_bpy.domain.Student;

import java.util.List;

/**
 * Persistence layer interface
 * Define the method of operating database.
 **/
public interface IStudentDao {
    //查询student表中的数据
    List<Student> selectStudents();
    //在student表中插入数据
    int insertStudents(Student student);
    //更新student表中的某项数据
    int updateStudents(Student student);
    //删除student表中的某项数据
    int deleteStudents(int id);
}
