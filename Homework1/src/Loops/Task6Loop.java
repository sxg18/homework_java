package Loops;

public class Task6Loop {
    public static void main(String[] args) {
        int a = 25;     // длина прямоугольника
        int b = 14;     // ширина прямоугольника
        int c = 5;      // длина стороны квадрата
        int k = 0;
        int j = 0;

        while (a >= c) {
            a = a - c;
            k++;
        }

        while (b >= c) {
            b = b - c;
            j++;
        }

        int n = k * j;      // количество квадратов

        System.out.println(n);
    }
}
