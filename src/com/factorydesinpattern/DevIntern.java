package com.factorydesinpattern;

public class DevIntern implements Employee {

    String name;
    int age;
    double salary;
    @Override
    public void getInformation() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }

    @Override
    public void getRole() {
        System.out.println("I am a Dev Intern at Zemoso technologies");
    }
}
