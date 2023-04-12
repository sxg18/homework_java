package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Scanner kek = new Scanner(System.in);
        System.out.println("Input date (format: YYYY/MM/DD hh:mm):");
        String inputDate = kek.nextLine();

        if (inputDate.matches("(1[0-9][0-9][0-9]|200[0-9]|201[1-2])/(0[0-9]|1[012])/([012][1-9]|30) ([01][0-9]|2[0-3]):(0[1-9]|[1-5][0-9])")) {
            System.out.println("This date exists.");
        } else {
            System.out.println("This date does not exist. Remember: the date format is YYYY/MM/DD hh:mm");
        }
    }
}