import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        ArrayList<Reader> readers = new ArrayList<Reader>();

        do {
            System.out.println("1 -- add new reader");
            System.out.println("2 -- taking a book");
            System.out.println("3 -- returning a book");
            System.out.println("4 -- reader status");
            System.out.println("5 -- all reader statuses");
            System.out.println("6 -- exit");

            number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1: {
                    System.out.println("Enter reader's surname: ");
                    String readerSurname = scanner.nextLine();
                    System.out.println("Enter reader's name: ");
                    String readerName = scanner.nextLine();
                    System.out.println("Enter reader's patronymic: ");
                    String readerPatronymic = scanner.nextLine();
                    System.out.println("Enter reader's ID: ");
                    int readerID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter reader's faculty: ");
                    String readerFaculty = scanner.nextLine();
                    System.out.println("Enter reader's birthdate: ");
                    String readerBirthDate = scanner.nextLine();
                    System.out.println("Enter reader's phone number: ");
                    int readerPhoneNumber = scanner.nextInt();
                    scanner.nextLine();

                    readers.add(new Reader(readerName, readerSurname, readerPatronymic, readerID, readerFaculty, readerBirthDate, readerPhoneNumber));

                    break;
                }
                case 2: {
                    System.out.println("Enter the name of the book: ");
                    String bookName = scanner.nextLine();
                    System.out.println("Enter the author of the book: ");
                    String bookAuthor = scanner.nextLine();
                    System.out.println("Enter the contents of the book: ");
                    String bookText = scanner.nextLine();

                    Book newBook = new Book(bookName, bookAuthor, bookText);

                    System.out.println("Enter reader's ID: ");
                    int newID = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;

                    for (Reader reader : readers) {
                        if (reader.getReaderID() == newID) {
                            reader.takeBook(newBook);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("This reader does not exist.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter the name of the book:");
                    String bookName = scanner.nextLine();
                    System.out.println("Enter reader's ID: ");
                    int newID = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;

                    for (Reader reader : readers) {
                        if (reader.getReaderID() == newID) {
                            reader.returnBook(bookName);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("This reader does not exist.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter reader's ID: ");
                    int newID = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (Reader reader : readers){
                        if (reader.getReaderID() == newID) {
                            reader.printStatus();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("This reader does not exist");
                    }
                    break;
                }
                case 5: {
                    for (Reader reader : readers) {
                        reader.printStatus();
                    }
                    break;
                }
                case 6: {
                    System.out.println("Exiting...");
                    break;
                }
                default: {
                    System.out.println("Error. Try again.");
                }
            }
        } while (number != 6);
    }
}