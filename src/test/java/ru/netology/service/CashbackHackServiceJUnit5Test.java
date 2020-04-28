package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceJUnit5Test {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        int amount = 1400;
        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainZero() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testZeroAmount() {
        int amount = 0;
        assertThrows(IllegalArgumentException.class, () -> service.remain(amount));
    }

    @Test
    public void testNegative() {
        int amount = -10;
        assertThrows(IllegalArgumentException.class, () -> service.remain(amount));
    }
}
