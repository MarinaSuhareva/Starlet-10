package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void salesVolumeForTheAnnualPeriod() {
        StatsService counting = new StatsService();
        long[] amountOfMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = counting.salesVolume(amountOfMonths);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void AverageSalesVolumeForTheAnnualPeriod() {
        StatsService counting = new StatsService();
        long[] amountOfMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = counting.averageSalesVolume(amountOfMonths);
        long expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void monthOfMaximumSale() {
        StatsService counting = new StatsService();
        long[] amountOfMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = counting.maxSales(amountOfMonths);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void monthOfMinimumSale() {
        StatsService counting = new StatsService();
        long[] amountOfMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = counting.minSales(amountOfMonths);
        long expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void monthsWithBelowAverageSales() {
        StatsService counting = new StatsService();
        long[] amountOfMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = counting.salesBelowAverage(amountOfMonths);
        long expected = 5;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void monthsWithAboveAverageSales() {
        StatsService counting = new StatsService();
        long[] amountOfMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = counting.salesAboveAverage(amountOfMonths);
        long expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}


