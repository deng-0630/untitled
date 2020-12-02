package com.bdqn.service;

import com.bdqn.dao.StudentDaoImpl;

public class StudentServiceImpl {
    private StudentDaoImpl studentDao;
    private String name;

    public String getName() {
        return name;
    }

    public StudentServiceImpl(StudentDaoImpl studentDao, String name) {
        this.studentDao = studentDao;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentDaoImpl getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }
}
