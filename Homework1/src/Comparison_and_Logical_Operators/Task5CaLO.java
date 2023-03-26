package Comparison_and_Logical_Operators;

public class Task5CaLO {
    public static void main(String[] args) {
        double a = -7;
        double b = 23.584;
        int n = 4;

        if (b == 0)
            System.out.println("Ошибка. Число b равно нулю.");
        else
            switch (n) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Невыполнимая операция");
        }
    }
}
