package Comparison_and_Logical_Operators;

public class Task3CaLO {
    public static void main(String [] args) {
        int a = 3;
        int b = 2;
        int c = 10;

        if (a > b && b > c)
            System.out.println(a + b);
        else if (a > b && b < c)
            System.out.println(a + c);
        else
            System.out.println(b + c);
    }
}
