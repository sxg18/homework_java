package Comparison_and_Logical_Operators;

public class Task6CaLO {
    public static void main(String[] args) {
       int a = 201;

       if (a > 999 || a < 0)
           System.out.println("Ошибка");
       else
           if (a % 2 == 0)
               if (a < 10)
                   System.out.println("Число чётное однозначное");
               else if (a < 100)
                   System.out.println("Число чётное двухзначное");
               else
                   System.out.println("Число чётное трёхзначное");
           else
               if (a < 10)
                   System.out.println("Число нечётное однозначное");
               else if (a < 100)
                   System.out.println("Число нечётное двухзначное");
               else
                   System.out.println("Число нечётное трёхзначное");
    }
}
