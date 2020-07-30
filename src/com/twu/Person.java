package com.twu;

public class Person {
    String name;
    Integer num;

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }
}
