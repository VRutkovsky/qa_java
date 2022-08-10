package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTest {

    public LionTest() {
   }

    @Test
    public void getKittensTest() throws Exception {
        Viviparous bigCat = new Feline();
        String sex = "Самец";
        Lion lion = new Lion(bigCat, sex );
        Assert.assertEquals("Проверка Наличия львят возвращает неверное значение " + lion.getKittens(), 1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Viviparous bigCat = new Feline();
        String sex = "Самка";
        Lion lion = new Lion(bigCat, sex );
        Assert.assertEquals("Несоответствие рациона льва", List.of("Животные", "Птицы", "Рыба"), lion.getFood());

    }
}