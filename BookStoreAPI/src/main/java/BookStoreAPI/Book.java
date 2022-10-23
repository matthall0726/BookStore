package BookStoreAPI;

public class Book implements Comparable<Book> {// Book class
    private String title;
    private String author;
    private int year;
    private int pages;
    private String genre;
    private String status;
    private int rating;

    public Book(String title, String author, int year, int pages, String genre, String status, int rating) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.genre = genre;
        this.status = status;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public String getStatus() {
        return status;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                ", status='" + status + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    /**
     * @param o2
     * @return
     */
    public int compare(Book o2) {
        return getAuthor().compareTo(o2.getAuthor());
    }
}