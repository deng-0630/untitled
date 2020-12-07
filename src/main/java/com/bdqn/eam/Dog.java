package com.bdqn.eam;

import org.springframework.stereotype.Component;

@Component("animal")
public class Dog implements Animal {

    public void show() {
        System.out.println("狗");
    }
}
