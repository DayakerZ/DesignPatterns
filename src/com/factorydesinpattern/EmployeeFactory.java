package com.factorydesinpattern;

public class EmployeeFactory {

    public Employee getInstance(String type){

        if(type.equals("Dev"))
            return new DevIntern();
        else if (type.equals("ACS"))
            return new AssociateSoftwareEngineer();
        else
            return null;
    }
}
