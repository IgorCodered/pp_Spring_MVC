package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repo.CarRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepository repository;

    @Autowired
    public CarServiceImpl(CarRepository repository) {
        this.repository = repository;
    }


    @Override
    public void add(String model, int maxSpeed, LocalDate date) {
        repository.add(model, maxSpeed, date);
    }

    @Override
    public List<Car> getCountCars(int count) {
        return repository.getCountCars(count);
    }
}
