package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsServise servise = new StatsServise();

        long actual = servise.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsServise servise = new StatsServise();

        long actual = servise.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsMaxSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsServise servise = new StatsServise();

        int actual = servise.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsMinSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsServise servise = new StatsServise();

        int actual = servise.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void quantityMonthsSaleBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsServise servise = new StatsServise();

        int actual = servise.belowAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quantityMonthsSaleHigherAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsServise servise = new StatsServise();

        int actual = servise.higherAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}