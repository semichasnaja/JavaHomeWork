package com.pb.semichasnaja.hw7;

public class Tie extends Clothes implements ManClothes {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.print("Галстук мужской: " + color + ", размер: "+ size);
        size.getInfoSize();
        System.out.print(", цена: " + price + " грн.");
        System.out.println();
    }
}
