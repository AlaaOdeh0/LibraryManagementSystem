package library;

public abstract class LibraryItem {
    private String title;
    private String author;
    private String publishDate;
    private String summary;
    private boolean isBorrowed = false;

    public LibraryItem(String title, String author, String publishDate, String summary) {
        this.title = title;
        this.author = author;
        this.setPublishDate(publishDate);
        this.setSummary(summary);
    }

    // Abstract methods
    public abstract void borrowItem();
    public abstract void returnItem();

    // Concrete method
    public void displayStatus() {
        String status = isBorrowed ? "Borrowed" : "Available";
        System.out.println("Title: " + title + ", Author: " + author + ", Status: " + status);
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    protected void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

	
	 //return the publishDate 
	public String getPublishDate() {
		return publishDate;
	}

	
	 // publishDate the publishDate to set 
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	
	 //return the summary 
	public String getSummary() {
		return summary;
	}


	// summary the summary to set	 
	public void setSummary(String summary) {
		this.summary = summary;
	}
}
