package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        long number = s.nextLong();
        int length = String.valueOf(number).length();
        int counter = 0;
        long digit = 0;
        long sum = 0;
        long secondSum = 0;
        int i = 0;
        long digit1 = 0;


        // Sum of every second digit starting from second to last
        while (counter < length) {
            long tempNu = number;
            tempNu /= 10;
            if (counter % 2 == 0) {
                digit = tempNu % 10;
                // If doubling of digit is two digit number subtract 9
                if ((digit * 2) > 9 && (digit * 2) < 100) {
                    digit = (digit * 2) - 9;
                    sum = sum + digit;
                } else {
                    sum = sum + (digit * 2);
                }
            } else {
                // The sum of the digits that weren’t multiplied by 2
                digit1 = number % 10;
                secondSum = secondSum + 10;
                long tempNu2 = number / 10;
                i++;
            }
            counter++;
        }
        
        // Adding those two sums
        
        sum = secondSum + sum;
        
        //Checking if card is valid
        isCreditCardValid(number, sum);
        }

        
        // Checking if card is valid and to which provider it belongs
        public static void isCreditCardValid(long num, long sum) {
            String numberString = "" + num;
            char firstLetterChar = numberString.charAt(0);
            char secondLetterChar = numberString.charAt(1);
            int firstDigit = Integer.parseInt("" + firstLetterChar);
            int secondDigit = Integer.parseInt("" + secondLetterChar);

            if (sum % 10 == 0) {
                System.out.println("Card is valid!");
                if (firstDigit == 4) {
                    System.out.println("Visa");
                }else if (firstDigit == 5 && secondDigit == 1 || secondDigit == 2 || secondDigit == 3 || secondDigit == 4) {
                    System.out.println("MasterCard");
                }else if (firstDigit == 3 && secondDigit == 4 || secondDigit == 7) {
                    System.out.println("American Express");
                }
            } else {
                System.out.println("Card is invalid!");
            }
        }

    }
	