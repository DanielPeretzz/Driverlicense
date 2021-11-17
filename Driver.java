package com.homework.daniel.Model;

import java.util.Objects;

public class Driver {
    public Driver(String driverName, String expiryDate, boolean isSuspended) {
        this.driverName = driverName;
        this.expiryDate = expiryDate;
        this.isSuspended = isSuspended;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    @Override
    public String toString() {
        return "Driver : " +
                "driverName = '" + driverName + '\'' +
                ", expiryDate = '" + expiryDate + '\'' +
                ", isSuspended = " + isSuspended ;

    }

    private final String driverName;
    private final String expiryDate;
    private final boolean isSuspended;

    public boolean isExpired(){
        if (Objects.equals(expiryDate, "15/11/21"))
        return true;
        else {
            return false;
        }
    }
    public void printMethod(){
        System.out.println(isExpired());
    }
}
