package Exception;

public class IncorrectInfoException extends Throwable {
    private int age;
    private String fullName;

    public IncorrectInfoException(String message, int age, String fullName) {
        super(message);
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
