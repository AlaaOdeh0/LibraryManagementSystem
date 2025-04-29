package library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create items
        Book book = new Book("Java Basics", "Alice", "2020", "Java Intro", "Programming");
        Magazine mag = new Magazine("Tech World", "Bob", "2021", "Monthly Tech", 10);
        Video video = new Video("AI Documentary", "Dr. Smith", "2023", "AI History", 45.0);
        ArchivedDoc doc = new ArchivedDoc("WWII Letters", "National Archives", "1945", "Historical docs", "Vault A");

        // Add items
        library.addLibraryItem(book);
        library.addLibraryItem(mag);
        library.addLibraryItem(video);
        library.addLibraryItem(doc);

        // Display items
        library.displayAllItems();

        // Borrow and return items
        library.borrowLibraryItem("Java Basics");
        library.borrowLibraryItem("AI Documentary");
        library.returnLibraryItem("Java Basics");

        // Final status
        library.displayAllItems();
    }
}
