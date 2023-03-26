package Loops;

public class Task4Loop {
    public static void main(String[] args) {
        int a = 4;
        int b = 11;
        int c = 0;

        for (int i = b - 1; i > a; i--) {
            b = b - 1;
            System.out.println(b);
            c++;
        }
        System.out.println("Total count is " + c);
    }
}
