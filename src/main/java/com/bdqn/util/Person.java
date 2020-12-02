package com.bdqn.util;

import java.util.Map;

public class Person {
    private Map<String,Car> cars;

    @Override
    public String toString() {
        return "Person{" +
                "cars=" + cars +
                '}';
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }
}
