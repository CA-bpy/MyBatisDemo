package com.ca_bpy.dao.impl;

import com.ca_bpy.dao.IStudentDao;
import com.ca_bpy.domain.Student;
import com.ca_bpy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * The implementation class
 **/
public class StudentDaoImpl implements IStudentDao {
    @Override
    public List<Student> selectStudents() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //sql语句唯一标识
        String sqlId = "com.ca_bpy.dao.IStudentDao.selectStudents";
        //执行sql语句
        List<Student> studentList = sqlSession.selectList(sqlId);
        sqlSession.close();
        return studentList;
    }

    @Override
    public int insertStudents(Student student) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String sqlId = "com.ca_bpy.dao.IStudentDao.insertStudents";
        int res = sqlSession.insert(sqlId,student);
        sqlSession.commit();
        sqlSession.close();
        return res;
    }

    @Override
    public int updateStudents(Student student) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String sqlId = "com.ca_bpy.dao.IStudentDao.updateStudents";
        int res = sqlSession.update(sqlId,student);
        sqlSession.commit();
        sqlSession.close();
        return res;
    }

    @Override
    public int deleteStudents(int id) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String sqlId = "com.ca_bpy.dao.IStudentDao.deleteStudents";
        int res = sqlSession.delete(sqlId,id);
        sqlSession.commit();
        sqlSession.close();
        return res;
    }
}
