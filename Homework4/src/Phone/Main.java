package Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(448994345, "iPhone 8", 144.4);
        Phone phone2 = new Phone(297990123, "Fairphone 4", 157.6);
        Phone phone3 = new Phone(254336502, "Samsung S23 Ultra");

        System.out.println();

        System.out.println("Phone.Phone 1: the number is " + phone1.getNumber() + ", the model is " + phone1.getModel() + ", and the weight is " + phone1.getWeight() + " grams.");
        System.out.println("Phone.Phone 2: the number is " + phone2.getNumber() + ", the model is " + phone2.getModel() + ", and the weight is " + phone2.getWeight() + " grams.");
        System.out.println("Phone.Phone 3: the number is " + phone3.getNumber() + ", the model is " + phone3.getModel() + ", and the weight is " + phone3.getWeight() + " grams.");

        System.out.println();

        phone1.receiveCall("Jack");
        phone2.receiveCall("Timothy");
        phone3.receiveCall("Sven");

        System.out.println();

        phone1.getCallerNumber(443774234);
        phone2.getCallerNumber(293334511);
        phone3.getCallerNumber(258899311);

        System.out.println();

        phone1.receiveCall("Kevin", 449993471);
        phone2.receiveCall("Robert", 297448112);
        phone3.receiveCall("Michael", 256309815);

        System.out.println();

        phone1.sendMessage(445970095, 299242480, 256328516);
        phone2.sendMessage(448238633, 297964840, 258087433);
        phone3.sendMessage(441518521, 291491465, 255641440);
    }
}