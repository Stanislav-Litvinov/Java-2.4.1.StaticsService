package ru.netology;

public class StatisticsService {
    public int getSum(int[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int getMiddleSum(int[] sales) {
        int middleSum = 0;
        for (long sale : sales) {
            middleSum += sale;
        }
        middleSum /= sales.length;
        return middleSum;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        int bestMonth = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = bestMonth;
            }
            bestMonth = bestMonth + 1;
        }
        return maxMonth + 1;
    }

    public int getLowestMonths(int[] sales) {
        int lowestMonths = 0;
        int middleSum = 0;
        for (long sale : sales) {
            middleSum += sale;
        }
        middleSum /= sales.length;
        for (long sale : sales) {
            if (sale < middleSum) {
                lowestMonths = lowestMonths + 1;
            }
        }
        return lowestMonths;
    }

    public int getBestMonths(int[] sales) {
        int bestMonths = 0;
        int middleSum = 0;
        for (long sale : sales) {
            middleSum += sale;
        }
        middleSum /= sales.length;
        for (long sale : sales) {
            if (sale > middleSum) {
                bestMonths = bestMonths + 1;
            }
        }
        return bestMonths;
    }
}

