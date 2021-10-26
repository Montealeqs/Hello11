package com.company;

public class Main {

    public static void main(String[] args) {
//        Ստեղծել երկչափ զանգված 5 X 5,
//                Լցնել ինդեքսների տարբերությունով`(i-j) եւ տպել:
        int [][]arr =new int[5][5];
        for (int i = 0; i <5 ; i++) {
            for (int j = 1; j < 5; j++) {
                arr[i][j] = i + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

