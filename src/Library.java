import java.util.ArrayList;

public class Library {
   private String address;
   private int numberOfEmployees;
   private ArrayList<String> books;

    public Library(String address, int numberOfEmployees, ArrayList<String> books) {
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.books = books;

    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public ArrayList<String> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<String> books) {
        this.books = books;

    }
    public void addBook (String title) {
        books.add(title);
    }
}
