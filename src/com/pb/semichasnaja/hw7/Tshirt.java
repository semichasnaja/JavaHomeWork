package com.pb.semichasnaja.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public Tshirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка мужская: " + color + ", размер: "+ size + ", цена: " + price + " грн.");
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка женская: " + color + ", размер: "+ size + ", цена: " + price + " грн.");
    }
}

