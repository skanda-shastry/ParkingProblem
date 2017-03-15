package com.car.parking.repositories;

import com.car.parking.common.Car;

import java.util.HashMap;

/**
 * Created by skandamurthy.bs on 03/03/17.
 */
public class ParkingRepository {

    private static int id = 1;
    private static ParkingRepository parkingRepository;
    private static HashMap<Integer,Car> parkingHistory;

    ParkingRepository(){
        parkingHistory = new HashMap<>();
    }

    public static ParkingRepository getParkingSlotInstance(){

        if (parkingRepository == null){
            parkingRepository = new ParkingRepository();
        }

        return parkingRepository;
    }

    public void addCarToParking(Car car){

        if (parkingHistory.containsKey(id)){
            System.out.println("Can't add same entry");
            return;
        }

        parkingHistory.put(id,car);
        id++;
    }
}
