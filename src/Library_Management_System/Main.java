package Library_Management_System;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book science = new Book("Science", "science author");
        Book maths = new Book("Maths", "maths author");
        Book hindi = new Book("Hindi", "hindi author");
        Book english = new Book("English", "english author");
        Book computer = new Book("Computer", "computer author");
        Book sst = new Book("Sst", "sst author");

        library.addBookInTheLibrary(science);
        library.addBookInTheLibrary(maths);
        library.addBookInTheLibrary(hindi);
        library.addBookInTheLibrary(english);
        library.addBookInTheLibrary(computer);
        library.addBookInTheLibrary(sst);

        User user1 = new User(1, "user1");
        User user2 = new User(2, "user2");
        User user3 = new User(3, "user3");
        User user4 = new User(4, "user4");

        System.out.println(library.getBooks());

        library.borrowBookFromTheLibrary(user1, science);
        library.borrowBookFromTheLibrary(user1, science);

        System.out.println(library.getBooks());
    }
}
