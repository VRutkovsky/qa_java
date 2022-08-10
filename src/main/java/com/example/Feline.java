package com.example;

import java.util.List;

public class Feline extends Animal implements Predator, Viviparous {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

//    @Override
  //  public List<String> getFood(String animalType) throws Exception {
//        return this.getFood(animalType);
//    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }
    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
