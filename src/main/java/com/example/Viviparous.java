package com.example;

import java.util.List;

public interface Viviparous {
    List<String> getFood(String animalType) throws Exception;
    int getKittens();
    int getKittens(int kittensCount);
}
