package com.bdqn.main;

import com.bdqn.eam.Perea;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text2 {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("sprint-annotation.xml");
        Perea perea= (Perea) ctx.getBean("kk");
        perea.show();
        System.out.println(perea);
    }
}
