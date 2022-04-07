package ru.netology.sqr;

public class SQRService {
    public int countSQRs(int lowerRange, int upperRange) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (lowerRange <= sqr && sqr <= upperRange) {
                counter++;
            }
        }
        return counter;
    }
}


