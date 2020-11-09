package com.ca_bpy;

import com.ca_bpy.dao.IStudentDao;
import com.ca_bpy.dao.impl.StudentDaoImpl;
import com.ca_bpy.domain.Student;

import org.junit.Test;

import java.util.List;

/**
 *  Unit test
 *  Test select method.
 *  Test insert method.
 */
public class TestDemo {

    IStudentDao studentDao = new StudentDaoImpl();

    //测试select方法
    @Test
        public void testSelect() {
//        IStudentDao dao = new StudentDaoImpl();
        List<Student> studentList =studentDao.selectStudents();
        System.out.println("查询表的内容结果如下：");
        for(Student students:studentList) {
            System.out.println(students);
        }
    }

    //测试insert方法
    @Test
    public void testInsert() {
        Student student = new Student();
        student.setId(20209595);
        student.setName("王小琑");
        student.setEmail("wxs@qq.com");
        student.setAge(3);
        int res = studentDao.insertStudents(student);
        System.out.println("表中插入了" + res + "条数据");
    }

    //测试update方法
    @Test
    public void testUpdate() {
        Student student = new Student();
        student.setId(20209595);
        student.setAge(4);
        int res = studentDao.updateStudents(student);
        System.out.println("表中更新了" + res + "条数据的年龄内容");
    }

    //测试delete方法
    @Test
    public void testDelete() {
        int res = studentDao.deleteStudents(20209595);
        System.out.println("表中删除了" + res + "条数据");
    }
}
