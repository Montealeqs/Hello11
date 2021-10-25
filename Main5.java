package com.company;

public class Main {

    public static void main(String[] args) {
//        Կազմել ծրագիր, որը կստուգի արդյոք String-ը պալինդրոմ է: Եթե
//        պալինդրոմ է, տպել "true", հակառակ դեպքում՝ "false":
        String  reverse = "kayak";
        int length = reverse.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + reverse.charAt(i);
        if (reverse.equals(reverse))
            System.out.println("true");
        else
            System.out.println("false");
    }
}