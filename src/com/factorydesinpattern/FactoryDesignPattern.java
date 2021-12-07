package com.factorydesinpattern;
public class FactoryDesignPattern {
    public static void main(String[] args) {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee employee = employeeFactory.getInstance("Dev");
        employee.getInformation();

    }//end of main
    //the basic goal of factory design pattern is to encapsulate object creation in another object
    //It violates open closed principle
}
