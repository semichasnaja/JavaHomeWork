package com.pb.semichasnaja.hw6;

import java.util.Objects;

public class Horse extends Animal{

    private String breedHorse;
    private String colorHorse;
    private int speedHorse;

    public Horse(String food, String location, String breedHorse, String colorHorse, int speedHorse) {
        super(food, location);
        this.breedHorse = breedHorse;
        this.colorHorse = colorHorse;
        this.speedHorse = speedHorse;
    }

    public String getBreedHorse() {
        return breedHorse;
    }

    public void setBreedHorse(String breedHorse) {
        this.breedHorse = breedHorse;
    }

    public String getColorHorse() {
        return colorHorse;
    }

    public void setColorHorse(String colorHorse) {
        this.colorHorse = colorHorse;
    }

    public int getSpeedHorse() {
        return speedHorse;
    }

    public void setSpeedHorse(int speedHorse) {
        this.speedHorse = speedHorse;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь шумит...");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return speedHorse == horse.speedHorse && Objects.equals(breedHorse, horse.breedHorse) && Objects.equals(colorHorse, horse.colorHorse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breedHorse, colorHorse, speedHorse);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breedHorse='" + breedHorse + '\'' +
                ", colorHorse='" + colorHorse + '\'' +
                ", speedHorse=" + speedHorse +
                '}';
    }
}
