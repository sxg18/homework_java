package Arrays;

import java.util.Scanner;

public class Task4Arrays {
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

        System.out.println("The array initially looks like this: ");
        for (int l : array) {
            System.out.print(l + ", ");
        }

        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }

        System.out.println("After sorting, the array looks like this: ");
        for (int l : array) {
            System.out.print(l + ", ");
        }
    }
}
