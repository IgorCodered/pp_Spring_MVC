package web.service;

import web.model.Car;

import java.time.LocalDate;
import java.util.List;

public interface CarService {
    void add(String model, int maxSpeed, LocalDate date);
    List<Car> getCountCars(int count);
}
