package Clinic;

import java.util.Arrays;
import java.util.List;

public class Clinic {
    public static void main(String[] args) {
        List<Animal> anims = Arrays.asList(new Cat("Meowgli", 5), new Dog("Woofenstein", 10), new Rat("Tekashi 69", 1));
        for (Animal anim : anims) {
            System.out.println(anim.getType() + " \"" + anim.getName() + "\"" + " is healthy for his age " + "(" + anim.getAge() + ")" + " and says \"" + anim.makeNoise() + "\" which means \"Hi!\".");
        }
    }
}