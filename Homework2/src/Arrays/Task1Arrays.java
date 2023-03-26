package Arrays;

public class Task1Arrays {
    public static void main (String[] args) {
        int min = 10;
        int max = 99;
        int[] array = new int[4];
        boolean order = true;

        for (int i = 0; i < array.length; i++) {
            double k = ((Math.random() * (max - min)) + min);
            array[i] = (int) k;
        }

        for (int l : array) {
            System.out.print(l +", ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i+1]) {
                order = false;
                break;
            } else {
                order = true;
            }
        }

        if (order) {
            System.out.println("\nThis array is sorted in ascending order");
        } else {
            System.out.println("\nThis array is not sorted in ascending order");
        }

    }
}
