package com.company.stringreverse;

public class Main {

    public static void main(String[] args) {
        String str = "String in normal order";

        double meanTime = 0;
        int meanInterval = 100;
        int[] repeatArray = {1000,10000,100000};

        StringReverseCustom sr = new StringReverseCustom();
        String strRevert = null;

        for (int k : repeatArray) {

            for (int mean_cnt = 0; mean_cnt < meanInterval; mean_cnt++) {
                double startTime = (double) (System.currentTimeMillis());

                for (int i = 0; i < k; i++) {
                    sr.reverse(str);
                }

                meanTime += (double) (System.currentTimeMillis()) - startTime;
            }
            System.out.printf("Время работы для %d повторений (в милисекундах) = %.2f%n", k, meanTime / meanInterval);
        }

        System.out.println(str);
        System.out.println(sr.reverse(str));

    }
}
