package com.tusofia.taxi;

import java.util.ArrayList;
import java.util.List;

public class TaxiCompany {
    String name;
    List<Taxi> taxiList = new ArrayList<Taxi>();
    List<Driver> driverList = new ArrayList<Driver>();

    public TaxiCompany() {
    }

    public TaxiCompany(String name, List<Taxi> taxiList, List<Driver> driverList) {
        this.name = name;
        this.taxiList = taxiList;
        this.driverList = driverList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Taxi> getTaxiList() {
        return taxiList;
    }

    public void setTaxiList(List<Taxi> taxiList) {
        this.taxiList = taxiList;
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }
}
