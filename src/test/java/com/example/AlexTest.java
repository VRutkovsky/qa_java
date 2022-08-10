package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AlexTest {

    public AlexTest(){
        }

    @Test
    public void getFriendsTest() throws Exception {
        List<String> listExpected = List.of("Марти", "Глория", "Мелман");
        Alex alex = new Alex();
        Assert.assertEquals("Алекс дружит с другими животными", listExpected, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        String strExpected = "Нью-Йоркский зоопарк";
        Alex alex = new Alex();
        Assert.assertEquals("Указано неверное место жительства Алекса", strExpected, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex();
        Assert.assertEquals("У Алекса нет львят", 0, alex.getKittens());
    }
}

