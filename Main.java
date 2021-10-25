package com.company;

public class Main {

    public static void main(String[] args) {
//        Կազմել ծրագիր, որը կտպի "Բաժանվում է", եթե a ամբողջ թիվը
//        բաժանվում է 3-ի եւ 5-ի: Հակառակ դեպքում տպել "Չի բաժանվում":
     int a=10;
        for (int i = 1; i <=a ; i++) {
            if (i%3==0)
                System.out.println("Բաժանվում է");
            else
                System.out.println("Չի բաժանվում");
        }
        for (int i = 1; i <= a; i++) {
            if (i%5==0)
                System.out.println("Բաժանվում է");

            else
                System.out.println("Չի բաժանվում");
        }
    }
}
