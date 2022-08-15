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
    public void getFoodExceptionTest() throws Exception {
        boolean exceptionHappened = true;
        try {
            Animal animal = new Animal();
            animal.getFood("Другое"); //"Другое"
            exceptionHappened = false;
        } catch (Exception e) {
            Assert.assertEquals("Текст сообщения об ошибке не совпадает с ожидаемым.", "Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        } finally {
            if(!exceptionHappened) {
                throw new Exception("Исключение не произошло. Тест прошел не корректно.");
            }
        }
    }

    @Test
    public void getFamilyTest(){
        String strExpected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        Assert.assertEquals("Перечень семейств не совпадает с ожидаемым", strExpected, animal.getFamily());
    }
}
