package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Ստեղծել միաչափ զանգված , տպել զանգվածի մեծագույն եւ փոքրագույն
//        տարրերի արտադրյալը:

            int[] arr = { 12, 1234, 45, 67, 1 };
            int n = arr.length;
            Arrays.sort(arr);
            int minEle = arr[0];
            int maxEle = arr[n-1];
            System.out.println(minEle*maxEle);
        }
    }
