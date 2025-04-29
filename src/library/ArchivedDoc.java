package library;

public class ArchivedDoc extends LibraryItem {
    private String archiveLocation;

    public ArchivedDoc(String title, String author, String publishDate, String summary, String archiveLocation) {
        super(title, author, publishDate, summary);
        this.archiveLocation = archiveLocation;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Borrowed Archived Document: " + getTitle() + " (Location: " + archiveLocation + ")");
        } else {
            System.out.println("Archived document is already borrowed: " + getTitle());
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Returned Archived Document: " + getTitle());
        } else {
            System.out.println("Archived document was not borrowed: " + getTitle());
        }
    }
}
