package com.java8.learn;

public class Car implements vehicle,fourWheeler{
    @Override
    public void print() {
        vehicle.super.print();
        fourWheeler.super.print();

        vehicle2.blowHorn();

        System.out.println("I am a car");
    }

//    @Override
//    public void print() {
//        System.out.println("I am a four wheeler car vehicle");
//    }
}
