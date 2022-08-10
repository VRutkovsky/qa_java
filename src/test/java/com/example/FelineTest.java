package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class FelineTest {
    private int kittenCount;

    public FelineTest(int kittenCount){
        this.kittenCount = kittenCount;
    }

    @Test
    public void felineEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        Assert.assertEquals("Кошачьи едят животных, птиц и рыб.", List.of("Животные", "Птицы", "Рыба") ,food);
    }

    @Test
    public void felineGetFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Должно быть семейство кошачьих", "Кошачьи", feline.getFamily());
    }

    @Test
    public void felineGetKittensDefaultTest(){
        Feline feline = new Feline();
        Assert.assertEquals("По-умолчанию должен быть один котенок", 1, feline.getKittens());
    }

    @Parameterized.Parameters
    public static Object[] getTestData() {
        return new Object[]{0, 1, 2, 3};
    }

    @Test
    public void felineGetKittensTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Котят должно быть " + kittenCount, kittenCount, feline.getKittens(kittenCount));
    }
}
