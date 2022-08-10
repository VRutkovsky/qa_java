package com.example;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AnimalTest {

    public AnimalTest(){
    }

    @Test
    public void getFoodHerbivoreTest() throws Exception {
        List<String> listExpected = List.of("Трава", "Различные растения");
        Animal animal = new Animal();
        Assert.assertEquals("Не верный рацион травоядного животного",listExpected, animal.getFood("Травоядное"));
    }

    @Test
    public void getFoodCarnivoreTest() throws Exception {
        List<String> listExpected = List.of("Животные", "Птицы", "Рыба");
        Animal animal = new Animal();
        Assert.assertEquals("Не верный рацион хищного животного",listExpected, animal.getFood("Хищник"));
    }

    @Test
    public void getFoodExceptionTest(){
        try {
            Animal animal = new Animal();
            animal.getFood("Другое");
        } catch (Exception e) {
            Assert.assertEquals("Текст сообщения об ошибке не совпадает с ожидаемым.", "Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }

    }

    @Test
    public void getFamilyTest(){
        String strExpected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        Assert.assertEquals("Перечень семейств не совпадает с ожидаемым", strExpected, animal.getFamily());
    }
}
