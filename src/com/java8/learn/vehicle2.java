package com.java8.learn;

public interface vehicle2 {
    default void print(){
        System.out.println("I am a vehicle 2");
    }

    static void blowHorn(){
        System.out.println("Blowing horn!!!");
    }
}
