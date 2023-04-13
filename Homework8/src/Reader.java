import java.util.ArrayList;

public class Reader {
    private String readerName;
    private String readerSurname;
    private String readerPatronymic;
    private int readerID;
    private String readerFaculty;
    private String readerBirthDate;
    private int readerPhoneNumber;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Reader(String readerName, String readerSurname, String readerPatronymic, int readerID, String readerFaculty, String readerBirthDate, int readerPhoneNumber){
        this.readerName = readerName;
        this.readerSurname = readerSurname;
        this.readerPatronymic = readerPatronymic;
        this.readerID = readerID;
        this.readerFaculty = readerFaculty;
        this.readerBirthDate = readerBirthDate;
        this.readerPhoneNumber = readerPhoneNumber;
    }

    public int getReaderID() {
        return readerID;
    }

    public void printStatus() {
        System.out.printf(readerSurname + " " + readerName.toUpperCase().charAt(0) + ". " + readerPatronymic.toUpperCase().charAt(0) + ". has take out %d book(s).", books.size());
        if (books.size() != 0) {
            for (Book book : books) {
                System.out.print(book.getBookName() + ", ");
            }
        }
    }
    public void takeBook(Book book) {
        if (books.size() <= 10) {
            System.out.println("Limit of books per person is 10.");
            return;
        }
        books.add(book);
        System.out.println(readerSurname + " " + readerName.toUpperCase().charAt(0) + ". " + readerPatronymic.toUpperCase().charAt(0) + ". took " + book.getBookName() + ".");
    }
    public void returnBook(String nameBook){
        if (books.contains(nameBook)) {
            books.remove(nameBook);
            System.out.println(readerSurname + " " + readerName.toUpperCase().charAt(0) + ". " + readerPatronymic.toUpperCase().charAt(0) + ". " + "has returned " + nameBook + ".");
        } else {
            System.out.println(readerSurname + " " + readerName.toUpperCase().charAt(0) + ". " + readerPatronymic.toUpperCase().charAt(0) + ". " + "doesn't have " + nameBook + ".");
        }
    }
}
