package com.pb.semichasnaja.hw6;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public static void treatAnimal(Animal animal) {
        System.out.println("Животное ест: " + animal.getFood());
        System.out.println("Животное происходит из: " + animal.getLocation());
    }
}
