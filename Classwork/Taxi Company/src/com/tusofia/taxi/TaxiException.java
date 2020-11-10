package com.tusofia.taxi;
public class TaxiException extends Exception {
    String message;

    public TaxiException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
