package Loops;

public class Task3Loop {
    public static void main(String[] args) {
        int i;
        int n = 15;
        long factorial = 1;

        for (i=1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
