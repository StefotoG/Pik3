package com.tusofia.taxi;
public class Taxi {
    String color;
    int year;
    String coupe;

    public Taxi() {

    }

    public Taxi(String color, int year, String coupe) throws TaxiException{
        if(color != "yellow"){
            throw new TaxiException("Taxi must be yellow!\r\n");
        }else if(year < 2000){
            throw new TaxiException("Taxi is too old!\r\n");
        }else if(coupe == "cabriolet"){
            throw new TaxiException("Taxi can't be cabriolet!\r\n");
        }else {
            this.color = color;
            this.year = year;
            this.coupe = coupe;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCoupe() {
        return coupe;
    }

    public void setCoupe(String coupe) {
        this.coupe = coupe;
    }
}
