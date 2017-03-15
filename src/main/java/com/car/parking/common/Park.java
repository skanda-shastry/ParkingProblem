package com.car.parking.common;

import com.car.parking.repositories.ParkingBuildingRepository;
import com.car.parking.repositories.ParkingRepository;
import com.car.parking.repositories.ParkingSlotRepository;

/**
 * Created by skandamurthy.bs on 06/03/17.
 */
public class Park {

    static {
        loadParkingSlot();
    }
    public ParkingBuilding carPark(Car car){

        ParkingRepository parkingRepository = ParkingRepository.getParkingSlotInstance();
        parkingRepository.addCarToParking(car);
        ParkingSlotRepository parkingSlotRepository = ParkingSlotRepository.getParkingSlotInstance();
        String parkingSlotId = parkingSlotRepository.getEmptyParkingSlot();
        ParkingSlot parkingSlot = new ParkingSlot(parkingSlotId);
        ParkingBuilding parkingBuilding = new ParkingBuilding(car,parkingSlot);
        parkingSlotRepository.removeParkingSlot(parkingSlotId);
        ParkingBuildingRepository parkingBuildingRepository = ParkingBuildingRepository.getParkingBuildingRepositoryInstance();
        parkingBuildingRepository.carToSlot(parkingSlotId,car);

        return parkingBuilding;

    }

    public Car getCar(ParkingSlot parkingSlot){

        ParkingBuildingRepository parkingBuildingRepository = ParkingBuildingRepository.getParkingBuildingRepositoryInstance();
        return parkingBuildingRepository.getCarBySlot(parkingSlot.getParkingLotId());
    }

    public static void loadParkingSlot(){

        System.out.println("Here in park loader");
        ParkingSlotRepository parkingSlotRepository = ParkingSlotRepository.getParkingSlotInstance();
        parkingSlotRepository.addSlot("Slot-1",1);
        parkingSlotRepository.addSlot("Slot-2",1);
        parkingSlotRepository.addSlot("Slot-3",2);
        parkingSlotRepository.addSlot("Slot-4",2);
        parkingSlotRepository.addSlot("Slot-5",3);
        parkingSlotRepository.addSlot("Slot-6",3);

    }

}
