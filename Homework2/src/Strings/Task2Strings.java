package Strings;

import java.util.Scanner;

public class Task2Strings {
    public static void main(String[] args) {
        Scanner kek = new Scanner(System.in);

        System.out.println("Input text: ");
        String text = kek.nextLine();

        while (text.length() <= 0) {
            System.out.println("Error. Try again.");
            text = kek.nextLine();
        }

        System.out.println("Input original character: ");
        String charOriginal = kek.nextLine();
        System.out.println("Input new character: ");
        String charNew = kek.nextLine();

        char chOrig = charOriginal.charAt(0);
        char chNew = charNew.charAt(0);

        char[] array = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (array[i] == chOrig) {
                array[i] = chNew;
            }
        }
        String textNew = new String(array);

        System.out.println("Original line of text: " + text);
        System.out.println("New line of text: " + textNew);
    }
}
