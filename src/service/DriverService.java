package service;

import model.Driver;
import reprository.DriverRepository;

import java.util.List;

public class DriverService {
    private DriverRepository driverRepository = new DriverRepository();

    public List<Driver> findAllDrivers(){
        return driverRepository.getAllDrivers();
    }
}
