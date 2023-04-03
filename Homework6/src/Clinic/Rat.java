package Clinic;

public class Rat extends Animal{
    public Rat(String name, int age){
        super(name, age);
        setType("Rat");
    }
    @Override
    public String makeNoise(){
        return "Squeak!";
    }
}
