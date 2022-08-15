package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;


@RunWith(Parameterized.class)
public class FelineTestWithParameter {
    private int kittenCount;

    public FelineTestWithParameter(int kittenCount){
        this.kittenCount = kittenCount;
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
