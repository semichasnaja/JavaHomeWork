package com.pb.semichasnaja.hw6;

import java.util.Objects;

public class Dog extends Animal{

    private String breedDog;
    private String colorDog;
    private String characterDog;

    public Dog(String food, String location, String breedDog, String colorDog, String characterDog) {
        super(food, location);
        this.breedDog = breedDog;
        this.colorDog = colorDog;
        this.characterDog = characterDog;
    }

    public String getBreedDog() {
        return breedDog;
    }

    public void setBreedDog(String breedDog) {
        this.breedDog = breedDog;
    }

    public String getColorDog() {
        return colorDog;
    }

    public void setColorDog(String colorDog) {
        this.colorDog = colorDog;
    }

    public String getCharacterDog() {
        return characterDog;
    }

    public void setCharacterDog(String characterDog) {
        this.characterDog = characterDog;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака шумит...");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breedDog, dog.breedDog) && Objects.equals(colorDog, dog.colorDog) && Objects.equals(characterDog, dog.characterDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breedDog, colorDog, characterDog);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedDog='" + breedDog + '\'' +
                ", colorDog='" + colorDog + '\'' +
                ", characterDog='" + characterDog + '\'' +
                '}';
    }
}
