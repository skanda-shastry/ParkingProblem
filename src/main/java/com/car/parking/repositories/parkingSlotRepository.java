package com.car.parking.repositories;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by skandamurthy.bs on 03/03/17.
 */
public class ParkingSlotRepository {

    private static ParkingSlotRepository parkingSlotRepository;

    private static HashMap<String,Integer> parkingSlots;

    private ParkingSlotRepository(){
        parkingSlots = new HashMap<>();
    }

    public static ParkingSlotRepository getParkingSlotInstance(){

        if ( parkingSlotRepository == null){
            parkingSlotRepository = new ParkingSlotRepository();
        }

        return parkingSlotRepository;
    }

    public void addSlot(String slotNumber,int level){

        if(parkingSlots.containsKey(slotNumber)){
            System.out.println("Slot number already there");
            return;
        }else {
            parkingSlots.put(slotNumber,level);
        }

    }


    public String getEmptyParkingSlot(){

        if (parkingSlots.isEmpty()){
            System.out.println("No free parking slot is available");
            return null;
        }

        Set<String> keyList = parkingSlots.keySet();
        return keyList.iterator().next();
    }

    public void removeParkingSlot(String parkingSlot){

        if (parkingSlots.containsKey(parkingSlot)){
            parkingSlots.remove(parkingSlot);
            return;
        }else {
            System.out.println("There is no such parking slot");
            return;
        }

    }


}
