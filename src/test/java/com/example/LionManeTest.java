package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionManeTest {
    private String sex;
    private boolean hasManeTest;

    public LionManeTest(String sex, boolean hasManeTest){
        this.sex = sex;
        this.hasManeTest = hasManeTest;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{{"Самец", true}, {"Самка", false}, {"Другое", false}};
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Viviparous bigCat = new Feline();
        try {
            Lion lion = new Lion(bigCat, sex);
            Assert.assertEquals("Проверка Наличия гривы возвращает не верное значение " + lion.doesHaveMane(), hasManeTest, lion.doesHaveMane());
        } catch (Exception e) {
            Assert.assertEquals("Текст сообщения об ошибке не совпадает с ожидаемым.", "Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }

    }

}
