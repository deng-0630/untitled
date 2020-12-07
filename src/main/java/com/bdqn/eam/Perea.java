package com.bdqn.eam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Properties;
@Component("kk")
public class Perea {
    @Autowired
    private Car car;

    private Animal animal;
    private String name;
    List<String> list;
    Properties properties;

    public Animal getAnimal() {
        return animal;
    }
    @Autowired(required = false)
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void show(){
        animal.show();
        car.show();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Perea(String name) {
        this.name = name;
    }
    public Perea(){

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
                "car=" + car +
                ", name='" + name + '\'' +
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
