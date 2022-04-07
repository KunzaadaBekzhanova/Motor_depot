package com.company;

import service.DriverService;

public class Main {

    public static void main(String[] args) {
        final DriverService driverService = new DriverService();

        driverService.findAllDrivers().forEach(System.out::println);
    }
}
