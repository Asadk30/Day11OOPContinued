import java.util.ArrayList;

public class Homework {
    public static void main(String[] args) {
        ArrayList<String> fictionBooks = new ArrayList<>();
        fictionBooks.add("trip");
        fictionBooks.add("nairobi");

        ArrayList<String> books = new ArrayList<>();
        books.add("coding");
        books.add("homework");

        Library bellevueLibrary = new Library ("50 sw st", 40, fictionBooks);
        Library seattleLibrary = new Library("30 e rd", 33, books);

        bellevueLibrary.addBook("student life");
        seattleLibrary.addBook("little");
        System.out.println(bellevueLibrary.getBooks());
        System.out.println(seattleLibrary.getBooks());
    }
}
/*
Create a class called Library that has the following properties:

String address
int numberOfEmployees
ArrayList<String> books
Add a constructor, getters, and setters.  In this same class add a method called addBook(String title).
Have this method take a book title and add it to the ArrayList of books.

In the main() method, create two instances of the Library class add books to both instances. Invoke the addBook()
method and add books. Next, in main() print the list of books.

Note: Remember how we would print a property of the object?

Library kingLibrary = new Library("123 Seattle St", 50, booksList);

System.out.println(kingLibrary.address);

Similarly, we can use invoke an object's methods using the same syntax:

kingLibrary.addBook("Can't Hurt Me: Master Your Mind and Defy the Odds");


 */