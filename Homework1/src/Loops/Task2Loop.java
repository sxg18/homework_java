package Loops;

public class Task2Loop {
    public static void main(String[] args) {
        int a = 1;

        do {
            if (a % 5 == 0)
                System.out.println(a);
                a++;
        } while (a <= 100);
    }
}
