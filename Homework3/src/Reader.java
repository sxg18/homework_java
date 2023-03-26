public class Reader {
    private String readerName;
    private String readerSurname;
    private String readerPatronymic;
    private int readerID;
    private String readerFaculty;
    private String readerBirthDate;
    private int readerPhoneNumber;
    private Book[] books = new Book[10];

    public Reader (String readerName, String readerSurname, String readerPatronymic, int readerID, String readerFaculty, String readerBirthDate, int readerPhoneNumber) {
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
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }

        if (count != 0) {
        System.out.print(readerSurname + " " + readerName.toUpperCase().charAt(0) + ". " + readerPatronymic.toUpperCase().charAt(0) + ". has taken out " + count + "book(s): ");
        for (Book book : books) {
            if (book != null) {
                System.out.print(book.getName());
            }
            }
        } else {
            System.out.print(readerSurname + " " + readerName.toUpperCase().charAt(0) + ". " + readerPatronymic.toUpperCase().charAt(0) + ". has taken out " + count + "books.");
        }
    }

    public void takeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
        System.out.println(readerSurname + " " + readerName.toUpperCase().charAt(0) + ". " + readerPatronymic.toUpperCase().charAt(0) + ". took" + book.getName() + ".");
    }

    public void returnBook(String nameBook) {
        boolean check = false;
        for (int k = 0; k < books.length; k++) {
            if (books[k] == null && books[k].getName().equals(nameBook)) {
                books[k] = null;
                System.out.println(readerSurname + " " + readerName.toUpperCase().charAt(0) + ". " + readerPatronymic.toUpperCase().charAt(0) + ". " + "has returned " + nameBook + ".");
                check = true;
                break;
            }
            if (!check) {
                System.out.println(readerSurname + " " + readerName.toUpperCase().charAt(0) + ". " + readerPatronymic.toUpperCase().charAt(0) + ". " + "doesn't have " + nameBook);
            }
        }
    }
}
