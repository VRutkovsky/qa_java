package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    //Инъекция зависимости
    Viviparous bigCat;

    public Lion(Viviparous bigCat, String sex) throws Exception {
        this.bigCat = bigCat;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            //System.out.println("Пол льва " + sex);
            //hasMane = false;
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    //Удалена зависимость от класса Feline
    //Feline feline = new Feline();

    //Перегружен метод getKittens()
    public int getKittens() {
        return bigCat.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    //Перегружен метод getFood()
    public List<String> getFood() throws Exception {
        return bigCat.getFood("Хищник");
    }
}
