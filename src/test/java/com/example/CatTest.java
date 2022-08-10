package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void catGetFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Вискас", "Китикэт"));
        List<String> food = cat.getFood();
        //System.out.println(food);
        Assert.assertEquals("Этот тест ждет Вискас и Китикэт",List.of("Вискас", "Китикэт") ,food);
    }

    @Test
    public void catGetSoundTest(){
        Cat cat = new Cat(new Feline());
        Assert.assertEquals("Кошка должна сказать Мяу", "Мяу",cat.getSound());
    }
}