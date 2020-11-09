package com.tusofia.taxi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Taxi> taxiList = new ArrayList<Taxi>();
        List<Driver> driverList = new ArrayList<Driver>();

        Driver jigit = new Driver(20,1,1);
        Taxi tarataika = new Taxi("yellow", "hotHatch");

        TaxiCompany company = new TaxiCompany("Maksim", taxiList, driverList);
    }
}
