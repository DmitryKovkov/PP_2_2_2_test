package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> listCar() {
        return carDao.listCars();
    }

    @Override
    public List<Car> listCar(int count) {
        return carDao.listCars(count);
    }
}
