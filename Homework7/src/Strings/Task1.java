package Strings;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("3");
        StringBuilder b = new StringBuilder("56");

        a.append(" + ").append(b).append(" = 59");
        System.out.println(a);
        a.replace(7, 8, "equals");
        System.out.println(a);
        a.delete(1,16);
        System.out.println();

        a.append(" - ").append(b).append(" = -53");
        System.out.println(a);
        a.replace(7,8,"equals");
        System.out.println(a);
        a.delete(1, 17);
        System.out.println();

        a.append(" * ").append(b).append(" = 168");
        System.out.println(a);
        a.replace(7, 8, "equals");
        System.out.println(a);
    }
}