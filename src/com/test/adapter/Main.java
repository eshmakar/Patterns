package com.test.adapter;

public class Main {
    public static void main(String[] args) {
     CarWash cw = new CarWash();
     cw.washCar(new Oka());
     cw.washCar(new TrackWrap(new Man()));
    }
}

interface Car{ void wash();}

class Oka implements Car{
    @Override
    public void wash() {
        System.out.println("Oka washing..."); }}

class CarWash{
    public void washCar(Car car){ car.wash(); }}


interface Track{ void clean();}

class Man implements Track{
    @Override
    public void clean() {
        System.out.println("Man cleaning..."); }}

class TrackWrap implements Car{
    private Track track;

    public TrackWrap(Track track) {
        this.track = track;
    }

    @Override
    public void wash() { track.clean(); }}