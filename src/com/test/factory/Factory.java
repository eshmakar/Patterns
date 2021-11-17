package com.test.factory;

//ФАБРИЧНЫЙ - FACTORY
//если необходимо получить несколько объектов одного типа
public class Factory {
    public static void main(String[] args) {
        Car kalina = FactoryFabric.createCar("Kalina");
        Car oka = FactoryFabric.createCar("Oka");
        kalina.drive();
        oka.drive();
    }
}

interface Car{
    void drive();
}

class Kalina implements Car{
    @Override
    public void drive() {
        System.out.println("Kalina dirve");
    }
}
class Oka implements Car{
    @Override
    public void drive() {
        System.out.println("Oka dirve");
    }
}
class FactoryFabric{
    public static Car createCar(String nameOfCar){
        switch (nameOfCar){
            case "Kalina": return new Kalina();
            case "Oka": return new Oka();
            default:return  null;
        }
    }
}