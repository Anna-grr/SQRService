package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void WhenLowerRangeIsMoreThanMinSqrAndUpperRangeIsLessThanMaxSqr() {
        SQRService service = new SQRService();
        int lowerRange = 200;
        int upperRange = 300;
        int expected = 3;

        int actual = service.countSQRs(lowerRange, upperRange);

        assertEquals(expected, actual);
    }

    @Test
    void WhenUpperRangeIsLessThanMinSqr() {
        SQRService service = new SQRService();
        int lowerRange = 0;
        int upperRange = 99;
        int expected = 0;

        int actual = service.countSQRs(lowerRange, upperRange);

        assertEquals(expected, actual);
    }

    @Test
    void WhenLowerRangeAndUpperRangeAreEqualToMinSqr() {
        SQRService service = new SQRService();
        int lowerRange = 100;
        int upperRange = 100;
        int expected = 1;

        int actual = service.countSQRs(lowerRange, upperRange);

        assertEquals(expected, actual);
    }

    @Test
    void WhenLowerRangeAndUpperRangeAreEqualToMaxSqr() {
        SQRService service = new SQRService();
        int lowerRange = 9801;
        int upperRange = 9801;
        int expected = 1;

        int actual = service.countSQRs(lowerRange, upperRange);

        assertEquals(expected, actual);
    }

    @Test
    void WhenLowerRangeIsMoreThanMaxSqr() {
        SQRService service = new SQRService();
        int lowerRange = 9802;
        int upperRange = 10000;
        int expected = 0;

        int actual = service.countSQRs(lowerRange, upperRange);

        assertEquals(expected, actual);
    }

    @Test
    void WhenLowerRangeIsEqualToMinSqrAndUpperRangeIsEqualToMaxSqr() {
        SQRService service = new SQRService();
        int lowerRange = 100;
        int upperRange = 9801;
        int expected = 90;

        int actual = service.countSQRs(lowerRange, upperRange);

        assertEquals(expected, actual);
    }
}