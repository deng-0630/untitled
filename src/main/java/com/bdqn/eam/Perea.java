package com.bdqn.eam;

import java.util.List;
import java.util.Properties;

public class Perea {
    private String name;
    List<String> list;
    Properties properties;

    public Perea(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("初始化");
    }
    public void destory(){
        System.out.println("关闭");
    }
    @Override
    public String toString() {
        return "Perea{" +
                "name='" + name + '\'' +
                ", list=" + list +
                ", properties=" + properties +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
