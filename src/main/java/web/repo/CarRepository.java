package web.repo;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.time.LocalDate;
import java.util.List;


public interface CarRepository {
    void add(String model, int maxSpeed, LocalDate date);
    List<Car> getCountCars(int count);
}
