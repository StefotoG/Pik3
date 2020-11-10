package com.tusofia.taxi;
public class DriverException extends Exception {
    String message;

    public DriverException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
