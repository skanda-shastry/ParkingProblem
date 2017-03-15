package com.car.parking.repositories;

import com.car.parking.common.Car;

import java.util.HashMap;

/**
 * Created by skandamurthy.bs on 07/03/17.
 */
public class ParkingBuildingRepository {

    private static HashMap<String,Car> parkingBuildingCollection;
    private static ParkingBuildingRepository parkingBuildingRepository;

    private ParkingBuildingRepository(){
        parkingBuildingCollection = new HashMap<>();
    }

    public static ParkingBuildingRepository getParkingBuildingRepositoryInstance(){
        if (parkingBuildingRepository == null){
            parkingBuildingRepository = new ParkingBuildingRepository();
        }

        return parkingBuildingRepository;
    }

    public void carToSlot(String parkingSlotId,Car car){
        parkingBuildingCollection.put(parkingSlotId,car);
        System.out.println("Parking slot car : "+parkingBuildingCollection.get(parkingSlotId));
    }

    public Car getCarBySlot(String parkingSlotId){
        //if (parkingBuildingCollection.containsKey(parkingSlot)){
            System.out.println("Parking slot car : "+parkingBuildingCollection.get(parkingSlotId));
            return parkingBuildingCollection.get(parkingSlotId);
        //}
        //System.out.println("There is not such car exist");
        //return null;
    }

}
