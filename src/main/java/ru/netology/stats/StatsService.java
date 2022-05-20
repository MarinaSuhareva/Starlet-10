package ru.netology.stats;

public class StatsService {
    public int salesVolume(long[] amountOfMonths) {
        int salesVolume = 0;
        for (long amountMonth : amountOfMonths) {
            salesVolume += amountMonth;
        }
        return salesVolume;
    }

    public int averageSalesVolume(long[] amountOfMonths) {
        int salesVolume = 0;
        for (long amountMonth : amountOfMonths) {
            salesVolume += amountMonth;

        }
        return salesVolume / amountOfMonths.length;
    }

    public int maxSales(long[] amountOfMonths) {
        int maxMonth = 0;
        int month = 0;
        for (long amountMonth : amountOfMonths) {
            if (amountMonth >= amountOfMonths[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] amountOfMonths) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long amountMonth : amountOfMonths) {
            // amountOfMonths[minMonth] - продажи в месяце minMonth
            // amountMonth - продажи в рассматриваемом месяце
            if (amountMonth <= amountOfMonths[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] amountOfMonths) {
        int average = averageSalesVolume(amountOfMonths);
        int monthBelowAverage = 0;
        for (long averageSalesVolume : amountOfMonths) {
            if (averageSalesVolume > average) {
                monthBelowAverage++;
            }
        }
        return monthBelowAverage;
    }

    public int salesAboveAverage(long[] amountOfMonths) {
        int average = averageSalesVolume(amountOfMonths);
        int monthsWithAboveAverage = 0;
        for (long averageSalesVolume : amountOfMonths) {
            if (averageSalesVolume < average) {
                monthsWithAboveAverage++;
            }

        }
        return monthsWithAboveAverage;
    }
}

