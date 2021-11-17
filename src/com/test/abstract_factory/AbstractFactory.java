package com.test.abstract_factory;
//АБСТРАКТНАЯ ФАБРИКА - ABSTRACT FACTORY (фабрика, которая создает другие фабрики)
public class AbstractFactory {
    public static void main(String[] args) {
        CarTankCreate car = new AbstractFactorySecond().create("car");
        CarTankCreate tank = new AbstractFactorySecond().create("tank");
        car.createCar("Kalina").drive();
        tank.createTank("T35").drive();
    }
}

interface Car{
    void drive();
}

class Kalina implements Car {
    @Override
    public void drive() {
        System.out.println("Kalina drive");
    }
}

class Oka implements Car {
    @Override
    public void drive() {
        System.out.println("Oka drive");
    }
}


interface Tank{
    void drive();
}

class T34 implements Tank {
    @Override
    public void drive() {
        System.out.println("T34 drive");
    }
}

class T35 implements Tank {
    @Override
    public void drive() {
        System.out.println("T35 drive");
    }
}

interface CarTankCreate{
    Car createCar(String nameOfCar);
    Tank createTank(String nameOfTank);
}


class CarFactory implements CarTankCreate {
    public Car createCar(String nameOfCar){
        switch (nameOfCar){
            case "Kalina": return new Kalina();
            case "Oka": return new Oka();
            default: return null;
        }
    }

    @Override
    public Tank createTank(String nameOfTank) {
        return null;
    }
}

class TankFactory implements CarTankCreate {
    @Override
    public Car createCar(String nameOfCar) {
        return null;
    }

    public Tank createTank(String nameOfTank){
        switch (nameOfTank){
            case "T34": return new T34();
            case "T35": return new T35();
            default: return null;
        }
    }
}

class AbstractFactorySecond{
    public CarTankCreate create(String type){
        switch (type){
            case "car": return new CarFactory();
            case "tank": return new TankFactory();
            default: return null;
        }
    }
}