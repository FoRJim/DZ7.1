package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxCenter() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 13, 14, 15, 16, 17, 16, 11, 10, 9, 8};
        long expected = 17;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void findMaxAtTheEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        long expected = 20;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}