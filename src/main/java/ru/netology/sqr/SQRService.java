package ru.netology.sqr;

public class SQRService {

    public int calcservice(int minimum, int maximum) {
        int calculator = 0;
        for (int i = 10; i <= 99; i++) {
            int ii = i + i;
            if (ii >= minimum) {
                if (ii <= maximum) {
                    calculator++;
                }
            }
        }
        return calculator;
    }
}
