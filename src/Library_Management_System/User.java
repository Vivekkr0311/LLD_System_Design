package Library_Management_System;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int user_id;
    private String username;
    private List<Book> borrowedBooks;

    public User(int user_id, String username) {
        this.user_id = user_id;
        this.username = username;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addToBorrowedList(Book book){
        this.getBorrowedBooks().add(book);
    }
}
