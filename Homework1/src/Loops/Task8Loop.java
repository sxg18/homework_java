package Loops;

public class Task8Loop {
    public static void main(String[] args) {
        double P = 2.5;         // interest
        double S = 1000;      // money amount
        int K = 0;            // the amount months

        if (P < 0 || P > 25)
            System.out.println("Ошибка");
        else
            while (S < 1100) {
                S = S + (S * P / 100);
                K++;
            }

        System.out.println(K);
        System.out.println(S);
    }
}
