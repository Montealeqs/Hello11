package com.company;

public class Main {

    public static void main(String[] args) {
//        2. Ստեղծել միաչափ զանգված ,
//                a) Զանգվածը լցնել -100...100 միջակայքում գտնվող այն ամբողջ թվերով,
//                որոնք չեն բաժանվում 3-ի:
//        b) Տպել զանգվածի բոլոր տարրերը:
        int sum = 0;
        for (int i = -100; i <= 100; i++) {
            if (i % 3 != 0)
                sum++;
        }
        System.out.println(sum);
        int arr[] = new int[sum];
        for (int i = 0, j = -100; j <= 100; j++) {
            if (j % 3 != 0) {
                arr[i] = j;
                i++;
            }
            for (int num : arr) {
                System.out.println(num);
            }
        }
    }
}
