package Library_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    Library(){
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBookInTheLibrary(Book book){
        this.getBooks().add(book);
    }

    public void borrowBookFromTheLibrary(User user, Book book){
       if(book.checkAvailability()){
           book.changeAvailability(false);
           user.addToBorrowedList(book);
           this.getBooks().remove(book);
           this.getBooks().add(book);
       }else{
           System.out.println(book + " is not available.");
       }
    }

    public void returnBookToTheLibrary(User user, Book book){
        book.changeAvailability(true);
        this.getBooks().add(book);
        user.getBorrowedBooks().remove(book);
    }
}
