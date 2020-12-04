package com.bdqn.util;

import java.util.Map;

public class Person {
    private Map<String,Car> cars;
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cars=" + cars +
                ", car=" + car +
                '}';
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }
}
