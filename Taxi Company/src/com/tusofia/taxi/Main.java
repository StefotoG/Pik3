package com.tusofia.taxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Taxi> taxiList = new ArrayList<Taxi>();
        List<Driver> driverList = new ArrayList<Driver>();

        try {
//            Uncomment to test exception
//            Driver newDriver = new Driver(20, false, true);

            Driver newDriver = new Driver(20,true,true);
            System.out.println("New driver was created!\r\n");
            driverList.add(newDriver);
            System.out.println("Driver was added to list!\r\n");
        } catch (DriverException e) {
            e.printStackTrace();
        }
        try {
//            Uncomment to test exception
//            Taxi newTaxi = new Taxi("yellow", 1998, "hotHatch");

            Taxi newTaxi = new Taxi("yellow", 2018, "hotHatch");
            System.out.println("New taxi was created!\r\n");
            taxiList.add(newTaxi);
            System.out.println("Taxi was added to list!\r\n");
        } catch (TaxiException e) {
            e.printStackTrace();
        }


        TaxiCompany company = new TaxiCompany("Maksim", taxiList, driverList);
        System.out.println("TaxiCompany was created!\r\n");

    }
}
