package Arrays;

import java.util.Scanner;

public class Task3Arrays {
    public static void main(String[] args) {
        Scanner kek = new Scanner(System.in);

        System.out.println("Input desired array length: ");
        int lenght = kek.nextInt();

        System.out.println("Input min value: ");
        int min = kek.nextInt();

        System.out.println("Input max value: ");
        int max = kek.nextInt();

        int array[] = new int[lenght];

        for (int i = 0; i < array.length; i++){
            double k = ((Math.random() * (max - min)) + min);
            array[i] = (int) k;
        }

        // test sout
        for (int l : array) {
            System.out.print(l + ", ");
        }

        int iMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[iMax]) {
                iMax = i;
            }
        }
        System.out.println("\nThe highest value in this array is " + array[iMax]+ "\nThe index of the highest array element is: " + iMax + ". \nDon't forget that the indexing starts with zero (0).");
    }
}
