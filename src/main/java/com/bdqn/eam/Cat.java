package com.bdqn.eam;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    public void show() {
        System.out.println("猫");
    }
}
