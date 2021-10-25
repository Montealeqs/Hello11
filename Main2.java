package com.company;

public class Main {

    public static void main(String[] args) {
//        9. Տպել տրված թվի բազմապատկման աղյուսակը (մինչեւ 10-ը)
        int num = 7, i = 1;
        while (i <= 10) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}

