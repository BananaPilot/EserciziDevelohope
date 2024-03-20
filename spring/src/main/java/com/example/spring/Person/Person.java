package com.example.spring.Person;

public class Person {
    private String name;
    private String region;
    private String hello;

    public Person(String name, String region) {
        this.name = name;
        this.region = region;
        this.hello = "Hi " + name + ", how is the weather in " + region + "?";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
