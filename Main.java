package com.company;

public class Main {

    public static void main(String[] args) {
//        3. Կազմել ծրագիր, որ կտպի 3 թվերից փոքրագույնը:
        int a = 40;
        int b = 20;
        int c = 30;
        int poqraguyn;
        if (a < b) {
            if (c < a) {
                poqraguyn = c;
            } else {
                poqraguyn = a;
            }
        } else {
            if (b < c) {
                poqraguyn = b;
            } else {
                poqraguyn = c;
            }
            System.out.println(poqraguyn);
        }
    }
}
