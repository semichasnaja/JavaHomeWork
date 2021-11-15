package com.pb.semichasnaja.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Брюки мужские: " + color + ", размер: "+ size + ", цена: " + price + " грн.");
    }

    @Override
    public void dressWomen() {
        System.out.println("Брюки женские: " + color + ", размер: "+ size + ", цена: " + price + " грн.");
    }
}
