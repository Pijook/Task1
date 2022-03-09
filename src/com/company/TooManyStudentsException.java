package com.company;

public class TooManyStudentsException extends Exception {

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println("Max students about reached!");
    }
}
