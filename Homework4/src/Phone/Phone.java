package Phone;

public class Phone {
    private long number;
    private String model;
    private double weight;

    public Phone() {

    }
    public Phone(long number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(long number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling.");
    }
    public void getCallerNumber(long callerNumber) {
        System.out.println("This number is calling you: " + callerNumber);
    }
    public void receiveCall(String callerName, long callerNumber) {
        System.out.println(callerName + " is calling you from this number: " + callerNumber);
    }

    public void sendMessage(long ... numbers) {
        System.out.print("Sending messages to: ");
        for (long val:numbers) {
            System.out.print(val + ", ");
        }
        System.out.println();
    }

    public long getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public double getWeight() {
        return weight;
    }
}
