package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getSubCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("Mersedes", 2020, "Black");
        Car car2 =new Car("Ferrari", 2006, "Red");
        Car car3 =new Car("Hummer", 2010, "Green");
        Car car4 =new Car("Linkoln", 1994, "Yellow");
        Car car5 =new Car("Cadillac", 1963, "White");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        if (count == 1){
            return cars.subList(0,1);
        }
        else if(count == 2){
            return cars.subList(0,2);
        }
        else if(count == 3){
            return cars.subList(0,3);
        }
        else if(count == 4){
            return cars.subList(0,4);
        }
        else if(count == 5){
            return cars.subList(0,5);
        }
        else return cars;
    }
}
