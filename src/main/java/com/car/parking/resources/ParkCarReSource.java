package com.car.parking.resources;

import com.car.parking.common.Car;
import com.car.parking.common.Park;
import com.car.parking.common.ParkingBuilding;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;

/**
 * Created by skandamurthy.bs on 06/03/17.
 */

@Path("/park_car")
public class ParkCarReSource implements Serializable {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ParkingBuilding carParking(Car car){

        Park park = new Park();
        //Park.loadParkingSlot();
        return park.carPark(car);

    }

}
