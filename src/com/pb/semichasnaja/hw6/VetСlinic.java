package com.pb.semichasnaja.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog("кости", "Германия", "Такса", "черный", "умный");
        Cat cat1 = new Cat("молоко", "Канада", "Сфинкс", "пятнистый", "бесшерстная");
        Horse horse1 = new Horse("сено", "Северная Америка", "Мустанг", "коричневый", 88);

        Animal[] arrayAnimals = new Animal[] {dog1, cat1, horse1};
        Class clazz = Class.forName("hw6.Veterinarian");
        Constructor constr = clazz.getConstructor(new Class[] {String.class});
        Object obj = constr.newInstance("Ветеринар");
        if (obj instanceof Veterinarian) {
            for (int i = 0; i < arrayAnimals.length; i++) {
                ((Veterinarian) obj).treatAnimal(arrayAnimals[i]);
            }
        }
    }
}
