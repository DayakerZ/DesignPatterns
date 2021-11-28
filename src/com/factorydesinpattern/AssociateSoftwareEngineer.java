package com.factorydesinpattern;

public class AssociateSoftwareEngineer implements Employee{
    String name;
    int age;
    double salary;
    @Override
    public void getInformation(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }

    @Override
    public void getRole() {
        System.out.println("I am an Associate Software Engineer at zemoso technologies");
    }

}
