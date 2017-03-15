package com.car.parking;

import com.car.parking.resources.CarNumberResource;
import com.car.parking.resources.ParkCarReSource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DWGettingStartedApplication extends Application<DWGettingStartedConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DWGettingStartedApplication().run(args);
    }

    @Override
    public String getName() {
        return "DWGettingStarted";
    }

    @Override
    public void initialize(final Bootstrap<DWGettingStartedConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DWGettingStartedConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(new ParkCarReSource());
        environment.jersey().register(new CarNumberResource());
    }

}
