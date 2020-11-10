package com.tusofia.taxi;
public class Driver {
    int years;
    boolean medID;
    boolean drivingLicense;

    public Driver() {
    }

    public Driver(int years, boolean medID, boolean drivingLicense) throws DriverException{
        if(years < 18){
            throw new DriverException("Driver is too young to drive!\r\n");
        }else if(!medID){
            throw new DriverException("Driver is ill!\r\n");
        }else if(!drivingLicense){
            throw new DriverException("Gypsy can't be a driver!\r\n");
        }else {
            this.years = years;
            this.medID = medID;
            this.drivingLicense = drivingLicense;
        }
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public boolean isMedID() {
        return medID;
    }

    public void setMedID(boolean medID) {
        this.medID = medID;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
