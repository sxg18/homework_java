package Exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IncorrectInfoException {
        Scanner kek = new Scanner(System.in);
        System.out.println("Enter full name:");
        String name = kek.nextLine();
        System.out.println("Enter age:");
        int age = kek.nextInt();    // "вести ФИО через пробел и возраст" reads as "Surname (space) Name (space) Patronymic/Middle Name, and after that, Age. If "вести ФИО и возраст через пробел" - sure, rewrite is upon us (oh joy!).

        try {
            StringBuilder nameString = new StringBuilder(name);

            if (age<0||age>100) {
                throw new IncorrectInfoException("The age is incorrect", age, name);
            } else if (name.length()>200 || Pattern.compile("[^а-яА-Яa-zA-Z ]").matcher(nameString).find()) {
                throw new IncorrectInfoException("The name is incorrect", age, name);
            }

            System.out.println("Name: " + nameString);
            System.out.println("Age: " + age);
            System.out.println("Is this correct?");
        } catch (IncorrectInfoException ex) {
            ex.printStackTrace();
        }
    }
}
