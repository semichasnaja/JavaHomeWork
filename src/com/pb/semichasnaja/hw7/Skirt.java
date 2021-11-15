package com.pb.semichasnaja.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка женская: " + color + ", размер: "+ size + ", цена: " + price + " грн.");
    }
}
