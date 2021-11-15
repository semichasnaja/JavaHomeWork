package com.pb.semichasnaja.hw7;

import com.pb.semichasnaja.hw6.Veterinarian;

public class Atelier {
    public static void dressWomen(Clothes[] clothes){
        for(Clothes cloth: clothes) {
            if (cloth  instanceof WomenClothes) {
                ((WomenClothes) cloth).dressWomen();
            }
        };
    }

    public static void dressMan(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof ManClothes) {
                ((ManClothes) cloth).dressMan();
            }
        }
        ;
    }

    public static void main(String[] args) {
        Clothes tshirt1 = new Tshirt(Size.L,600.00,"белая");
        Clothes pants1 = new Pants(Size.M,999.99,"черные");
        Clothes skirt1 = new Skirt(Size.M,800.20,"черная");
        Clothes tie1 = new Tie(Size.S,250.40,"синий");
        Clothes[] array = {tshirt1, pants1, skirt1, tie1};
        System.out.println("Женская одежда: ");
        dressWomen(array);
        System.out.println("Мужская одежда: ");
        dressMan(array);
    }
}
