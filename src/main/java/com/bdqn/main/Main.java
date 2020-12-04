package com.bdqn.main;

import com.bdqn.dao.StudentDaoImpl;
import com.bdqn.service.StudentServiceImpl;
import com.bdqn.util.DB;
import com.bdqn.util.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Sprint-config2.xml");
        DB db=ctx.getBean(DB.class);
        System.out.println(db);
    }
}
