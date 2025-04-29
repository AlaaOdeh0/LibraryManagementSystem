package library;

public class Magazine extends LibraryItem {
    private int edition;

    public Magazine(String title, String author, String publishDate, String summary, int edition) {
        super(title, author, publishDate, summary);
        this.edition = edition;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Borrowed Magazine: " + getTitle() + " (Edition: " + edition + ")");
        } else {
            System.out.println("Magazine is already borrowed: " + getTitle());
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Returned Magazine: " + getTitle());
        } else {
            System.out.println("Magazine was not borrowed: " + getTitle());
        }
    }
}
