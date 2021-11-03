package com.company;

public class Main {

    public static void main(String[] args) {
        double dvoika[] = {16.1, 3.0, 6.66,
                -5.45, -9.1, 3.14,
                -5.1, 99.0, 1.12,
                -9.9, 7.77, 0.0,
                -1.0, 50.7, 19.41};

        double sum = 0;
        double non = 0;
        boolean wrong = false;
        for (double each : dvoika) {
            if (each < 0) {
                wrong = true;
            } else if (wrong) {
                    non++;
                    sum += each;
                }
        }
        System.out.println(sum/non);
    }
    }
