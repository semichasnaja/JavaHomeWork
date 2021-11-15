package com.pb.semichasnaja.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public Tshirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.print("Футболка мужская: " + color + ", размер: "+ size);
        size.getInfoSize();
        System.out.print(", цена: " + price + " грн.");
        System.out.println();
    }

    @Override
    public void dressWomen() {
        System.out.print("Футболка женская: " + color + ", размер: "+ size);
        size.getInfoSize();
        System.out.print(", цена: " + price + " грн.");
        System.out.println();
    }
}

