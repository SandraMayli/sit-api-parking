package com.parking.apiparking.services;

import com.parking.apiparking.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    private List<Car>  parkingLot;
    public ParkingService(){
        this.parkingLot=new ArrayList<>();
    }

    //TODO:Como usuario, quiero poder ver la lista de todos los autos estacionados en el
    //parqueo, para poder tener una visión general del estado actual del estacionamiento.
    public List<Car> getAllCars(){
        return this.parkingLot;
    }

    //TODO: Como usuario, quiero poder buscar un auto por su placa, para poder encontrar
    //rápidamente un vehículo en particular
    public void addCar(Car car){
        this.parkingLot.add(car);
    }
}
