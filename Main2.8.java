package com.company;

public class Main {

    public static void main(String[] args) {
//        4. Գտնել եւ տպել նախադասության ամենաերկար բառը:
        String str = "es aprum em erevanum ";
        String[] words = str.split(" ");
        int length = 0;

        for (String word : words) {
            if (length < word.length()) { length = word.length();
            }
        }
        System.out.println(length);
    }
}
