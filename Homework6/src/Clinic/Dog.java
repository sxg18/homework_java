package Clinic;

public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
        setType("Dog");
    }
    @Override
    public String makeNoise(){
        return "Woof!";
    }
}
