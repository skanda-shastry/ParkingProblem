package com.car.parking.common;

/**
 * Created by skandamurthy.bs on 03/03/17.
 */
public class Car {

    private String registrationNumber;
    private String colour;

    public Car(){

    }

    public Car(String registrationNumber,String colour){
        this.registrationNumber = registrationNumber;
        this.colour = colour;
    }

    public String getRegistrationNumber(){

        return registrationNumber;

    }

    public String getColour(){
        return colour;
    }
}
