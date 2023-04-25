package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void calculatorTestFewMatches() {
        SQRService service = new SQRService();

        int actual = service.calcservice(10, 99);
        int expected = 40;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorTestZeroMatches() {
        SQRService service = new SQRService();

        int actual = service.calcservice(99, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorTestOneMatch() {
        SQRService service = new SQRService();

        int actual = service.calcservice(10, 20);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

}