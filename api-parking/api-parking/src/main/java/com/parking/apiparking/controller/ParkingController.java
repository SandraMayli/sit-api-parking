package com.parking.apiparking.controller;

import com.parking.apiparking.entities.Car;
import com.parking.apiparking.services.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parking") //Parte de la URL
public class ParkingController {
    //Para tener acceso
    //Inyeccion de dependencias

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }
    @GetMapping ("cars") //Obtener la lista de carros
    public ResponseEntity<List<Car>> getAllCars(){
       return ResponseEntity.ok(this.parkingService.getAllCars());
    }

    @PostMapping("cars") //Obtener la lista de carros
    public ResponseEntity<Car> addCar(Car car){
        this.parkingService.addCar(car);
        return new ResponseEntity<>(car, HttpStatus.CREATED);//PARA LOS ESTADOS DE RESPUESTA
    }

}

