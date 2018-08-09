package cn.ncu.mytest.service;

import cn.ncu.mytest.model.Student;

import java.util.List;

public interface StudentService  {
    Boolean deleteStudentById(Integer id);
    int addStudent(Student student);
    Boolean updateStudentById(Student student);
    List<Student> findAllStudent(Student student);

}
