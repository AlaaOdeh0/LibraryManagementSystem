package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addLibraryItem(LibraryItem item) {
        items.add(item);
    }

    public void borrowLibraryItem(String title) {
        LibraryItem item = searchByTitle(title);
        if (item != null) {
            item.borrowItem();
        } else {
            System.out.println("Item not found: " + title);
        }
    }

    public void returnLibraryItem(String title) {
        LibraryItem item = searchByTitle(title);
        if (item != null) {
            item.returnItem();
        } else {
            System.out.println("Item not found: " + title);
        }
    }

    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayStatus();
        }
    }

    public LibraryItem searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }
}
