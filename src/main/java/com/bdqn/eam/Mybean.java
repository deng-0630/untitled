package com.bdqn.eam;

import org.springframework.beans.factory.FactoryBean;

public class Mybean implements FactoryBean<Perea> {
    private String bname;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Perea getObject() throws Exception {
        return new Perea(getBname());
    }

    public Class<?> getObjectType() {
        return Perea.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
