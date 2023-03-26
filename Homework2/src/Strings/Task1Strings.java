package Strings;

import java.util.Scanner;

public class Task1Strings {
    public static void main(String[] args) {
        Scanner kek = new Scanner(System.in);

        System.out.println("Input a line of text: ");
        String text = kek.nextLine();

        System.out.println("Input a character: ");
        String character = kek.nextLine();

        char ch = character.charAt(0);

        int count = 0;
        for (char k : text.toCharArray()) {
            if (ch == k) {
                count++;
            }
        }

        System.out.println("The line of text given: " + "'" + text + "'");
        System.out.println("The character given: " + "'" + character + "'" + ". It appears " + count + " times.");
    }
}
