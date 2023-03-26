package Arrays;

import java.util.Scanner;

public class Task6Arrays {
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

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("\nThe inverse of the array looks like this: ");

        for (int l : array) {
            System.out.print(l + ", ");
        }
    }
}
