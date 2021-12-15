package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class statisticsServiceTest {git remote add origin git@github.com:Stanislav-Litvinov/StaticsService.git
    @Test
    void ShouldCalculateSum() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.getSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateMiddleSum() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.getMiddleSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateMinMonth() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.getMinMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateMaxMonth() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.getMaxMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateLowestMonths() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.getLowestMonths(sales);

        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateBestMonths() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.getBestMonths(sales);

        assertEquals(expected, actual);
    }
}