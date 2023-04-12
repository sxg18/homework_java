package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner kek = new Scanner(System.in);

        System.out.println("Input text:");
        String text = kek.nextLine();

        Pattern websitePattern = Pattern.compile("[a-zA-Z0-9]+.com");
        Matcher websiteMatcher = websitePattern.matcher(text);
        while (websiteMatcher.find()) {
            System.out.println(websiteMatcher.group());
        }
    }
}
