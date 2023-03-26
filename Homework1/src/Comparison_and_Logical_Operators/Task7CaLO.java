package Comparison_and_Logical_Operators;

public class Task7CaLO {
    public static void main(String[] args) {
       int d = 26;
       int m = 5;

       if (d < 0 || d > 31 || m < 0 || m > 12)
           System.out.println("Ошибка");

       if (m == 1)
           if (d <= 19)
               System.out.println("Козерог");
           else
               System.out.println("Водолей");

       if (m == 2)
           if (d <= 18)
               System.out.println("Водолей");
           else
               System.out.println("Рыбы");

       if (m == 3)
           if (d <= 20)
               System.out.println("Рыбы");
           else
               System.out.println("Овен");

       if (m == 4)
           if (d <= 19)
               System.out.println("Овен");
           else
               System.out.println("Телец");

       if (m == 5)
           if (d <= 20)
               System.out.println("Телец");
           else
               System.out.println("Близнецы");

       if (m == 6)
           if (d <= 21)
               System.out.println("Близнецы");
           else
               System.out.println("Рак");

       if (m == 7)
           if (d <= 22)
               System.out.println("Рак");
           else
               System.out.println("Лев");

       if (m == 8)
           if (d <= 22)
               System.out.println("Лев");
           else
               System.out.println("Дева");

       if (m == 9)
           if (d <= 22)
               System.out.println("Дева");
           else
               System.out.println("Весы");

       if (m == 10)
           if (d <= 22)
               System.out.println("Весы");
           else
               System.out.println("Скорпион");

       if (m == 11)
           if (d <= 22)
               System.out.println("Скорпион");
           else
               System.out.println("Стрелец");

       if (m == 12)
           if (d <= 21)
               System.out.println("Стрелец");
           else
               System.out.println("Козерог");

    }
}
