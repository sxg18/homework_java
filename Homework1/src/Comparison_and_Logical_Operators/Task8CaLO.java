package Comparison_and_Logical_Operators;

public class Task8CaLO {
    public static void main(String[] args) {
        int N = 14;
        int M = 1;
        String value = null;
        String suit = null;

        if (N < 6 || N > 14 || M < 1 || M > 4)
            System.out.println("Ошибка");
        else
            switch (N) {
                case 6:
                    value = "Шестёрка";
                    break;
                case 7:
                    value = "Семёрка";
                    break;
                case 8:
                    value = "Восьмёрка";
                    break;
                case 9:
                    value = "Девятка";
                    break;
                case 10:
                    value = "Десятка";
                    break;
                case 11:
                    value = "Валет";
                    break;
                case 12:
                    value = "Дама";
                    break;
                case 13:
                    value = "Король";
                    break;
                case 14:
                    value = "Туз";
                    break;
            }

            switch (M) {
                case 1:
                    suit = "пик";
                    break;
                case 2:
                    suit = "червей";
                    break;
                case 3:
                    suit = "треф";
                    break;
                case 4:
                    suit = "бубен";
                    break;
            }

        System.out.println(value + " " + suit);
    }
}
