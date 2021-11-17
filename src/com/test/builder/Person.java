package com.test.builder;

import java.util.List;

//СТРОИТЕЛЬ - BUILDER
//используется, если много параметров надо указать, а создавать всевозможные конструкты затрудняет чтение кода
public class Person {
    private String name;
    private String lastName;
    private int age;
    private int height;
    private List<Person> parents;

    static class Builder{
        private Person newPerson;
        public Builder(){
            newPerson=new Person();
        }

        public Builder withName(String name){
            newPerson.name=name;
            return this;
        }
        public Builder withLastName(String lastName){
            newPerson.lastName=lastName;
            return this;
        }
        public Builder withAge(int age){
            newPerson.age=age;
            return this;
        }
        public Builder withHeight(int height){
            newPerson.height=height;
            return this;
        }
        public Builder withParents(List<Person> parents){
            newPerson.parents=parents;
            return this;
        }

        public Person build(){
            return newPerson;
        }
    }


    public static void main(String[] args) {
        Person Mike = new Person.Builder()
                .withName("Mike")
                .withLastName("Pool")
                .withAge(25)
                .withHeight(175)
                .build();
        System.out.println(Mike);
    }

    @Override
    public String toString() {
        return "com.test.builder.Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", parents=" + parents +
                '}';
    }
}
