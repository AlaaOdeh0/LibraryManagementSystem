package library;

public class Video extends LibraryItem {
    private double duration; // duration in minutes

    public Video(String title, String author, String publishDate, String summary, double duration) {
        super(title, author, publishDate, summary);
        this.duration = duration;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Borrowed Video: " + getTitle() + " (Duration: " + duration + " mins)");
        } else {
            System.out.println("Video is already borrowed: " + getTitle());
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Returned Video: " + getTitle());
        } else {
            System.out.println("Video was not borrowed: " + getTitle());
        }
    }
}
