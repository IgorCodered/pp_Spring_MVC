package web.repo;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.time.LocalDate;
import java.util.List;

@Repository
public class CarHibernateDAO implements CarRepository{

    private final SessionFactory session;

    @Autowired
    public CarHibernateDAO(SessionFactory session) {
        this.session = session;
    }

    @Override
    public void add(String model, int maxSpeed, LocalDate date) {
        session.openSession().beginTransaction();

    }

    @Override
    public List<Car> getCountCars(int count) {
        return null;
    }
}
