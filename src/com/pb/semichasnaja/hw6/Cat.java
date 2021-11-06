package com.pb.semichasnaja.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private String breedCat;
    private String colorCat;
    private String coatLengthCat;

    public Cat(String food, String location, String breedCat, String colorCat, String coatLengthCat) {
        super(food, location);
        this.breedCat = breedCat;
        this.colorCat = colorCat;
        this.coatLengthCat = coatLengthCat;
    }

    public String getBreedCat() {
        return breedCat;
    }

    public void setBreedCat(String breedCat) {
        this.breedCat = breedCat;
    }

    public String getColorCat() {
        return colorCat;
    }

    public void setColorCat(String colorCat) {
        this.colorCat = colorCat;
    }

    public String getCoatLengthCat() {
        return coatLengthCat;
    }

    public void setCoatLengthCat(String coatLengthCat) {
        this.coatLengthCat = coatLengthCat;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка шумит...");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breedCat, cat.breedCat) && Objects.equals(colorCat, cat.colorCat) && Objects.equals(coatLengthCat, cat.coatLengthCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breedCat, colorCat, coatLengthCat);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breedCat='" + breedCat + '\'' +
                ", colorCat='" + colorCat + '\'' +
                ", coatLengthCat='" + coatLengthCat + '\'' +
                '}';
    }
}
