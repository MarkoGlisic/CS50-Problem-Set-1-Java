package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter how much money you want to withdraw: ");
        int amount = s.nextInt();
        s.nextLine();

        int payment5000 = 0;
        int payment2000 = 0;
        int payment1000 = 0;
        int payment500 = 0;
        int payment200 = 0;
        int payment100 = 0;
        int payment50 = 0;
        int payment20 = 0;
        int payment10 = 0;
        int payment5 = 0;
        int payment2 = 0;
        int payment1 = 0;

        while (amount >= 5000) {
            payment5000++;
            amount-=5000;
        }
        while (amount >= 2000) {
            payment2000++;
            amount-=2000;
        }
        while (amount >= 1000) {
            payment1000++;
            amount-=1000;
        }
        while (amount >= 500) {
            payment500++;
            amount-=500;
        }
        while (amount >= 200) {
            payment200++;
            amount-=200;
        }
        while (amount >= 100) {
            payment100++;
            amount-=100;
        }
        while (amount >= 50) {
            payment50++;
            amount-=50;
        }
        while (amount >= 20) {
            payment20++;
            amount-=20;
        }
        while (amount >= 10) {
            payment10++;
            amount-=10;
        }
        while (amount >= 5) {
            payment5++;
            amount-=5;
        }
        while (amount >= 2) {
            payment2++;
            amount-=2;
        }
        while (amount >= 1) {
            payment1++;
            amount-=1;
        }

        if (payment5000 > 0) {
            System.out.println("Withdrew " + payment5000 + " bills of 5000");
        }

        if (payment2000 > 0) {
            System.out.println("Withdrew " + payment2000 + " bills of 2000");
        }

        if (payment1000 > 0) {
            System.out.println("Withdrew " + payment1000 + " bills of 1000");
        }

        if (payment500 > 0) {
            System.out.println("Withdrew " + payment500 + " bills of 500");
        }

        if (payment200 > 0) {
            System.out.println("Withdrew " + payment200 + " bills of 200");
        }

        if (payment100 > 0) {
            System.out.println("Withdrew " + payment100 + " bills of 100");
        }

        if (payment50 > 0) {
            System.out.println("Withdrew " + payment50 + " bills of 50");
        }

        if (payment20 > 0) {
            System.out.println("Withdrew " + payment20 + " bills of 20");
        }

        if (payment10 > 0) {
            System.out.println("Withdrew " + payment10 + " bills of 10");
        }

        if (payment5 > 0) {
            System.out.println("Withdrew " + payment5 + " bills of 5");
        }

        if (payment2 > 0) {
            System.out.println("Withdrew " + payment2 + " bills of 2");
        }
        if (payment1 > 0) {
            System.out.println("Withdrew " + payment1 + " bills of 1");
        }
    }
}

