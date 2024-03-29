package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K24Square1dot38() {
        double expected = 1.38;
        int p = 12;
        double k = 24;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP81K34Square45dot52() {
        double expected = 45.52;
        int p = 81;
        double k = 34;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}