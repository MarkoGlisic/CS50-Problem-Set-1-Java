package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter number of rows: ");
        int rows = s.nextInt();
        s.nextLine();

        for (int i = 0; i < rows; i++) {
            for (int j = rows - 1; j > i; j-- ) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("#");
            }
            for (int l = 0; l < 1; l++) {
                System.out.print(" ");
            }
            for (int m = 0; m < i + 1; m++){
                System.out.print("#");
            }
            for (int n = rows - 1; n > i; n--) {
                System.out.print(" ");
            }


            System.out.println();
        }
        System.out.println();
        
        System.out.println("Successfully built pyramid of " + rows + " rows." );
        
    }
}