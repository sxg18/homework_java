public class Book {
        private String bookName;
        private String bookAuthor;
        private String bookText;

        public Book(String bookName, String bookAuthor, String bookText) {
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
            this.bookText = bookText;
        }
        public String getName() {
            return bookName;
        }
}