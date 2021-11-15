package com.pb.semichasnaja.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.print("Брюки мужские: " + color + ", размер: "+ size);
        size.getInfoSize();
        System.out.print(", цена: " + price + " грн.");
        System.out.println();
    }

    @Override
    public void dressWomen() {
        System.out.print("Брюки женские: " + color + ", размер: "+ size);
        size.getInfoSize();
        System.out.print(", цена: " + price + " грн.");
        System.out.println();
    }
}
