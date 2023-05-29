package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Sedan", "Tesla", 100000));
        cars.add(new Car("Hatchback", "Mitsubishi", 15000));
        cars.add(new Car("Minivan", "Plymouth", 7000));
        cars.add(new Car("Van", "Chevrolet", 70000));
        cars.add(new Car("Bus", "Volvo", 200000));
    }

    @Override
    public List<Car> showCarsList(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
