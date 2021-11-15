package com.pb.semichasnaja.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.print("Юбка женская: " + color + ", размер: "+ size);
        size.getInfoSize();
        System.out.print(", цена: " + price + " грн.");
        System.out.println();
    }
}
