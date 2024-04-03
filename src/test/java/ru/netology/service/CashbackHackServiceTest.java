package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateLess() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1999);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateEquals() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateOver() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2001);
        int expected = 999;

        assertEquals(expected, actual);
    }
}