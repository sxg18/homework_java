package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text = "ahb acb aeb aeeb adcb axeb";

        Pattern pattern = Pattern.compile("a+.{1}+b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
