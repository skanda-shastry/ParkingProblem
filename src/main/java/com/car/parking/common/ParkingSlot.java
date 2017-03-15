package com.car.parking.common;

/**
 * Created by skandamurthy.bs on 03/03/17.
 */
public class ParkingSlot {

    private String parkingLotId;

    ParkingSlot(){

    }

    ParkingSlot(String parkingLotId){
        this.parkingLotId = parkingLotId;
    }

    public String getParkingLotId(){
        return parkingLotId;
    }

}
