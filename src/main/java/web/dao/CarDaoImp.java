package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    @Override
    public List<Car> listCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Черная"));
        carList.add(new Car("Nissan", "Белый"));
        carList.add(new Car("Mercedes-Benz", "Синий"));
        carList.add(new Car("BMW", "Красный"));
        carList.add(new Car("KIA", "Серый"));
        System.out.println(carList);
        return carList;
    }

    @Override
    public List<Car> listCars(int count) {
        return listCars().stream().limit(count).toList();
    }
}
