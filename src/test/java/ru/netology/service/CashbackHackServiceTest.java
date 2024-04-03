package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateLess() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateEquals() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateOver() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2001);
        int expected = 999;

        assertEquals(actual, expected);
    }
}