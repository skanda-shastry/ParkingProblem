package com.car.parking.resources;

import com.car.parking.common.Car;
import com.car.parking.common.Park;
import com.car.parking.common.ParkingSlot;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;

/**
 * Created by skandamurthy.bs on 06/03/17.
 */
@Path("/car_number")
public class CarNumberResource implements Serializable {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car getCarNumber(ParkingSlot parkingSlot){

        Park park = new Park();
        return park.getCar(parkingSlot);

    }

}
