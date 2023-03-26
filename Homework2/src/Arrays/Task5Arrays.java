package Arrays;

import java.util.Scanner;

public class Task5Arrays {
    public static void main(String[] args) {
        Scanner kek = new Scanner(System.in);

        int index = -1;
        int array[] = new int[20];

        System.out.println("Input min value: ");
        int min = kek.nextInt();
        System.out.println("Input max value: ");
        int max = kek.nextInt();

        for (int i = 0; i < array.length; i++) {
            double k = ((Math.random() * (max - min)) + min);
            array[i] = (int) k;
        }

        for (int l : array) {
            System.out.print(l + ", ");
        }

        System.out.println("\nInput target value: ");
        int value = kek.nextInt();

        for (int j = 0; j < array.length; j++) {
            if (array[j] == value) {
                index = j;
            }
        }
        System.out.println("Target value is " + value + " and it's index is " + index + ". \nDon't forget that the indexing starts with zero (0).");
    }
}
