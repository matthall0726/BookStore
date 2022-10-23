package Group8.BookStoreAPI;
import java.util.Arrays;


public class BookStore {// BookStore class
    public static void main(String args[]) {
        Book[] books = new Book[5];
        books[0] = new Book("Standard Economics", "James Gosling", 2000, 100, "Non-Fiction", "", 8);
        books[1] = new Book("Charlie and the Chocolate Factory", "Bjarne Stroustrup", 1999, 200, "Fiction",
                "Top Seller", 9);
        books[2] = new Book("90 Days in Prison", "Dennis Ritchie", 1998, 300, "Horror", "", 5);
        books[3] = new Book("Brothers in Arm", "Anders Hejlsberg", 2001, 400, "Religous", "Top Seller", 9);
        books[4] = new Book("Python", "Guido van Rossum", 2002, 500, "Non-Fiction", "Top Seller", 7);
        System.out.println(Arrays.toString(books));

        

        System.out.println("Books with rating 9:");
        for (Book book : books) {
            if (book.getRating() == 9) {
                System.out.println(book);
            }
        }

        System.out.println("Books with rating 9 and status Top Seller:");

        for (Book book : books) {
            if (book.getRating() == 9 && book.getStatus().equals("Top Seller")) {
                System.out.println(book);
            }
        }

        System.out.println("Books with genre Fiction:");
        for (Book book : books) {
            if (book.getGenre().equals("Fiction")) {
                System.out.println(book);
            }
        }
        

        //Sort books by genre and print
        Arrays.sort(books);
        System.out.println("Books sorted by genre:");
        System.out.println(Arrays.toString(books));
        

        //Sort books by rating and print

        Arrays.sort(books);

        System.out.println("Books sorted by rating:");
        System.out.println(Arrays.toString(books));

        //Sort books by year and print

        Arrays.sort(books);

        System.out.println("Books sorted by year:");
        System.out.println(Arrays.toString(books));

        //Sort books by pages and print

        Arrays.sort(books);

        System.out.println("Books sorted by pages:");
        System.out.println(Arrays.toString(books));

        //Sort books by title and print

        Arrays.sort(books);

        System.out.println("Books sorted by title:");
        System.out.println(Arrays.toString(books));

        //Sort books by author and print

        Arrays.sort(books);

        System.out.println("Books sorted by author:");
        System.out.println(Arrays.toString(books));

        //Sort books by status and print

        Arrays.sort(books);

        System.out.println("Books sorted by status:");
        System.out.println(Arrays.toString(books));



    }


}

// Language: java
// Path: Book.java
