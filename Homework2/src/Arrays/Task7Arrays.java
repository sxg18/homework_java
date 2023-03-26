package Arrays;

import java.util.Scanner;

public class Task7Arrays {
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

        int iMax;
        int temp;
        for (int i = array.length - 1; i >=0; i--) {
            iMax = i;
            for (int j = i; j >= 0; j--) {
                if (array[j] > array[iMax]) {
                    iMax = j;
                }
            }
            if (iMax != i) {
                temp = array[iMax];
                array[iMax] = array[i];
                array[i] = temp;
            }
        }

        System.out.println("\nAfter sorting, the array looks like this: ");
        for (int l :array) {
            System.out.print(l + ", ");
        }

        System.out.println();

        System.out.println("Input target value: ");
        int targetValue = kek.nextInt();

        int index = -1;
        int lineCount = 0;
        int doubleCount = 0;

        for (int i = 0; i < array.length; i++) {
            lineCount++;
            if (array[i] == targetValue) {
                index = i;
                break;
            }
        }

        int lowIndex = 0;
        int highIndex = array.length -1;
        int elementIndex = -1;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            doubleCount++;
            if (targetValue == array[midIndex]) {
                elementIndex = midIndex;
                break;
            } else if (targetValue < array[midIndex]) {
                highIndex = midIndex - 1;
            } else if (targetValue > array[midIndex]) {
                lowIndex = midIndex + 1;
            }
        }

        System.out.println("The index of the target value: " + index + ". Don't forget that the indexing starts with zero (0).");
        System.out.println("Line search step count: " + lineCount);
        System.out.println("Double search step count: " + doubleCount);
    }
}
