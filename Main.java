package com.company;

public class Main {

    public static void main(String[] args) {
//        Գտնել եւ տպել 0-ից մինչեւ տրված n-թվերի միջակայքում գտնվող
//        բոլոր այն թվերը որոնք 3 եւ 5 են բաժանվում առանց մնացորդի։
        int n=100;
        for (int i = 0; i <n ; i++) {
            if (i%3==0 && i%5==0)
                System.out.println(i);

        }
    }
}
