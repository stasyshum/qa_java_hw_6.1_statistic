package ru.netology.stats;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    private StatsService service;

    @BeforeEach
    void setUp() {
        service = new StatsService();
        int[] testData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        service.setStatistics(testData);
    }

    @AfterEach
    void tearDown() {
        service.clearStatistics();
        service = null;
    }

    @Test
    void getSummary() {
        long expected = 180;

        long actual = service.getSummary();

        assertEquals(expected, actual);
    }
    @Test
    void getMean() {
        double expected = 15;

        double actual = service.getMean();

        assertEquals(expected, actual);
    }

    @Test
    void getHightMonthSale() {
        int expected = 7;

       int actual = service.getHightMonthSale();

        assertEquals(expected, actual);
    }

    @Test
    void getMinimalMonthSale() {
        int expected = 8;

        int actual = service.getMinimalMonthSale();

        assertEquals(expected, actual);
    }

    @Test
    void getUnderMeanSale() {
        int expected = 5;

        int actual = service.getUnderMeanSale();

        assertEquals(expected, actual);
    }

    @Test
    void getOverMeanSale() {
        int expected = 5;

        int actual = service.getOverMeanSale();

        assertEquals(expected, actual);
    }
}
