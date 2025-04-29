package library;

public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, String publishDate, String summary, String genre) {
        super(title, author, publishDate, summary);
        this.genre = genre;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Borrowed Book: " + getTitle() + " (Genre: " + genre + ")");
        } else {
            System.out.println("Book is already borrowed: " + getTitle());
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Returned Book: " + getTitle());
        } else {
            System.out.println("Book was not borrowed: " + getTitle());
        }
    }
}
