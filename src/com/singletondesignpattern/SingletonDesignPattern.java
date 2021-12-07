package com.singletondesignpattern;

//Ensure that a class has only one instance and provide a global point of access to it.
//across the application there should be only one instance of that class and access from a single point
//make the constructor private
//global point of access: static method to get the sole instance
//objects having same hashcode are pointing to same reference
//Reflection,serialization,cloning,multiple thread access
// object.setAccessible(true) violates encapsulation in turn violates sole instance
public class SingletonDesignPattern {
    public static void main(String[] args) {
        try {
            Password attempt1 = Password.getInstance();
            attempt1.validatePassword("Dayaker");
            Password attempt2 = Password.getInstance();
            attempt2.validatePassword("gdhdjyfy");
            Password attempt3 = Password.getInstance();
            attempt3.validatePassword("12345678");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
