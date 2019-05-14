package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car = new Car(2019, "BMW", "MLE-365");
        repository.save(car);

        car = new Car(2020, "Tesla","Roadster");
        repository.save(car);

        car = new Car(2012, "Toyota", "Bandwagon");
        repository.save(car);
    }
}
