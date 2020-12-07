package com.bdqn.main;

import com.bdqn.eam.Demp;
import com.bdqn.eam.Perea;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextMain {
    public static void main(String[] args) {
        ApplicationContext apl=new ClassPathXmlApplicationContext("Sprint-config4.xml");
        Perea perea = (Perea) apl.getBean("perea");
        Perea perea1 = (Perea) apl.getBean("perea1");
        System.out.println(perea1);

        System.out.println(perea);
    }

}
