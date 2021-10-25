package com.company;

public class Main {

    public static void main(String[] args) {
//        7. Տպել “Evenish” եթե տրված քառանիշ n թվի բոլոր թվանշանների
//        գումարը զույգ է , հակառակ դեպքում տպել “Oddish”
        int n=2345;

        String num=String.valueOf(n);
        for(int i = 0; i < num.length(); i++)
            if (i % 2 == 0)
                System.out.println( " evenish");
            else
        System.out.println("oddish");

    }
}
