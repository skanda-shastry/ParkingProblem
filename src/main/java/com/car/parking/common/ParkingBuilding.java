package com.car.parking.common;

/**
 * Created by skandamurthy.bs on 03/03/17.
 */
public class ParkingBuilding {

    private Car car;
    private ParkingSlot parkingSlot;

    public ParkingBuilding(){

    }

    ParkingBuilding(Car car,ParkingSlot parkingSlot){
        this.car = car;
        this.parkingSlot = parkingSlot;
    }

    public Car getCar(){
        return car;
    }

    public ParkingSlot getParkingSlot(){
        return parkingSlot;
    }

}
