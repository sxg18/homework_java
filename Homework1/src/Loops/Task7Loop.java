package Loops;

public class Task7Loop {
    public static void main(String[] args) {

        int N = 962;
        int a = 0;
        int sum = 0;
        int t = N;
        int tR = N;
        int dig = 1;
        int reverse = 0;
        boolean divide = false;


        for (int i = 1; i < N;) {
            a++;
            i = i * 10;
        }

        for (int i = a - 1; i >= 0; i--){
            int b = 1;

            for (int l = 0; l < i; l++){
                b = b * 10;
            }

            if (t / b == 2) {
                divide = true;
            }

            sum = sum + (t / b);
            t = t % b;
        }

        while (tR != 0) {
            reverse = reverse * 10 + tR % 10;
            tR = tR / 10;
        }

        if (divide) {
            System.out.println("Number " + N + " is dividable by 2");
        } else {
            System.out.println("Number " + N + " is not dividable by 2");
        }

        System.out.println("The reverse of the number " + N + " is " + reverse);
        System.out.println("The number of digits in " + N + " is " + a);
        System.out.println("The sum of digits in " + N + " is " + sum);
    }
}
