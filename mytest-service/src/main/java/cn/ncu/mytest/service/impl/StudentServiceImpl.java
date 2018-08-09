package cn.ncu.mytest.service.impl;

import cn.ncu.mytest.dao.StudentDao;
import cn.ncu.mytest.model.Student;
import cn.ncu.mytest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService {
    @Autowired
    private StudentDao studentDao;
    public Boolean deleteStudentById(Integer id) {
        Student student = new Student();
        student.setId(id);
        return studentDao.delete(student);
    }

    public int  addStudent(Student student) {
        return studentDao.insert(student);
    }

    public Boolean updateStudentById(Student student) {
        return studentDao.update(student);
    }

    public List<Student> findAllStudent(Student student) {
        return studentDao.select(student);
    }
}

