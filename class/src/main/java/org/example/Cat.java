package org.example;

import java.awt.*;

public class Cat {
   private int age;
   private String name;
    private double weight;
    private String breed;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0.0;
        this.breed = "Unknown";
    }
    public Cat(String name, int age, double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0.0; // Вес по умолчанию
        this.breed = "Unknown"; // Порода по умолчанию
    }
}
