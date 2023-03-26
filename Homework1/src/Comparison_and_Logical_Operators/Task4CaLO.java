package Comparison_and_Logical_Operators;

public class Task4CaLO {
    public static void main(String[] args) {
        int year = 2007;

        if (year % 4 != 0)
            System.out.println("Год невисокосный");
        else if (year % 100 == 0 && year % 400 != 0)
            System.out.println("Год невисокосный");
        else
            System.out.println("Год високосный");
    }
}
