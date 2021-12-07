package com.singletondesignpattern;

import java.io.Serializable;

public class Password implements Cloneable, Serializable {

    private final String password = "12345678";
    private static Password passwordInstance = null;
    private static int  count = 3;

    //reflection safe
    private Password(){
        if (passwordInstance!=null)
            throw new RuntimeException();
    }

    //thread safe
    public static synchronized Password getInstance(){
        if (passwordInstance==null){
            passwordInstance = new Password();
            count--;
        }
        else count--;
        return passwordInstance;
    }

    public void validatePassword(String password){
        if (this.password.equals(password)&& count > -1) {
            System.out.println("Password is valid and you have the access");
        }
        else if(count > -1) {
            System.out.println("Password invalid ..please try again\nYou have "+count+" attempts");
        }
        else
            System.out.println("You have reached the limit");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    protected Object readResolve(){
        return passwordInstance;
    }

}
























 /* @Override
    protected Object readResolve(){
        return passwordInstance;
    }*/