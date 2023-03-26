package Arrays;

import java.util.Scanner;

public class Task2Arrays {
    public static void main(String[] args) {
        Scanner kek = new Scanner(System.in);

        System.out.println("Input desired array length: ");
        int length = kek.nextInt();

        System.out.println("Input min value: ");
        int min = kek.nextInt();

        System.out.println("Input max value: ");
        int max = kek.nextInt();

        // Retrying just once

//        if (length < 1 || min >= max) {
//            System.out.println("Error. Try again.");
//
//            System.out.println();
//
//            System.out.println("Input desired array length: ");
//            int lengthRetry = kek.nextInt();
//            length = lengthRetry;
//
//            System.out.println("Input min value: ");
//            int minRetry = kek.nextInt();
//            min = minRetry;
//
//            System.out.println("Input max value: ");
//            int maxRetry = kek.nextInt();
//            max = maxRetry;
//        }

        // Retrying continuously

        while (length < 1 || min > max) {
            System.out.println("Error. Try again.");

            System.out.println("Input desired array length: ");
            int lengthRetry = kek.nextInt();
            length = lengthRetry;

            System.out.println("Input min value: ");
            int minRetry = kek.nextInt();
            min = minRetry;

            System.out.println("Input max value: ");
            int maxRetry = kek.nextInt();
            max = maxRetry;
        }

        int array[] = new int[length];

        for (int i = 0; i < array.length; i++) {
            double k = ((Math.random() * (max - min)) + min);
            array[i] = (int) k;
        }

        for (int l : array) {
            System.out.print(l +", ");
        }

    }
}
