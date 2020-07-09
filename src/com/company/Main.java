package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number to multiply: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter array size: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        int [] theArray = multiplyArray(num, length);
        System.out.println("The multiplied arrays are " + Arrays.toString(theArray));

    } public static int [] multiplyArray (int num, int length) {
        int [] theArray = new int[length];
        int counter = 1;
        for (int i = 0; i < theArray.length; i++) {
            theArray[i] = num * counter;
            counter++;
        }
        return theArray;
    }

    }
