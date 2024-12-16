package Library_Management_System;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void changeAvailability(boolean state){
        this.isAvailable = state;
    }

    public boolean checkAvailability(){
        return this.isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
