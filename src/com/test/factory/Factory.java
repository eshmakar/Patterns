package com.test.factory;

//ФАБРИЧНЫЙ - FACTORY
//если необходимо получить несколько объектов одного типа
public class Factory {
    public static void main(String[] args) {
        Car kalina = FactoryFabric.createCar("com.test.factory.Kalina");
        Car oka = FactoryFabric.createCar("com.test.factory.Oka");
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
        System.out.println("com.test.factory.Kalina dirve");
    }
}
class Oka implements Car{
    @Override
    public void drive() {
        System.out.println("com.test.factory.Oka dirve");
    }
}
class FactoryFabric{
    public static Car createCar(String nameOfCar){
        switch (nameOfCar){
            case "com.test.factory.Kalina": return new Kalina();
            case "com.test.factory.Oka": return new Oka();
            default:return  null;
        }
    }
}