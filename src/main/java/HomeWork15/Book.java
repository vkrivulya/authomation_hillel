package HomeWork15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.numberOfPages = numberOfPages;
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void addAuthors(Author... author){
        authors.addAll(Arrays.asList(author));
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
