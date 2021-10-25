package com.company;

public class Main {

    public static void main(String[] args) {
//        5. Վերցնել ամբողջ թիվ: Switch օպերատորի միջոցով տպել
//        շաբաթվա օրը,
//        որը համապատասխանում է մեր թվին: Եթե այդպիսի շաբաթվա օր
//        գոյություն չունի՝ տպել "Գոյություն չունի":
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Գոյություն չունի");
        }
    }
}
