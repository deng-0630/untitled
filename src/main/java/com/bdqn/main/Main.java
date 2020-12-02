package com.bdqn.main;

import com.bdqn.dao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Sprint-config.xml");
       StudentDaoImpl stu= (StudentDaoImpl) ctx.getBean("studentDao");
        System.out.println(stu);
    }
}
