package Clinic;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
        setType("Cat");
    }
    @Override
    public String makeNoise() {
        return "Meow!";
    }
}
