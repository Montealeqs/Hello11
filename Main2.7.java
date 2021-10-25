package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int numbers[] = new int[]{-12, 11, -13, -5, 6, 7, 5, -3, -6};
        for (int i = 0; i < numbers.length; i++) {

        }
        int posCount = 0;
        int negCount = 0;
        int positive[] = null;
        int negative[] = null;
        for (int i : numbers) {
            if (i >= 0)
                ++posCount;
            else
                ++negCount;
        }
        if (posCount == 0) {
            System.out.println("Array = " + Arrays.toString(numbers));
        } else if (negCount == 0) {
            System.out.println("Array = " + Arrays.toString(numbers));
        }
        positive = new int[posCount];
        negative = new int[negCount];
        int i = 0;
        int j = 0;
        for (int num : numbers) {
            if (num >= 0) {
                positive[i++] = num;
            } else {
                negative[j++] = num;
            }
        }
        System.out.println("Negative numbers = " + Arrays.toString(negative));
        System.out.println("Positive numbers = " + Arrays.toString(positive));


    }
}
