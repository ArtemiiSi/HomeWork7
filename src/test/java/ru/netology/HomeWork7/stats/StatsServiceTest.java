package ru.netology.HomeWork7.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    public void totalAmountAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        long actualSum = service.totalSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        long actualAverage = service.averageOfSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maximumSalesMonthNumber() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void minimumSalesMonthNumber() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMonth = 5;
        long actualSumMonth = service.belowAverage(sales);

        Assertions.assertEquals(expectedSumMonth, actualSumMonth);
    }

    @Test
    public void salesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMonth = 5;
        long actualSumMonth = service.aboveAverage(sales);

        Assertions.assertEquals(expectedSumMonth, actualSumMonth);
    }

}
