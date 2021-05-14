package HomeWork15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Author {
    private String name;
    private short age;
    private List<Book> books;

    public Author(String name, short age) {
        this.name = name;
        this.age = age;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void addBooks(Book... book){
        books.addAll(Arrays.asList(book));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
//                ", books=" + books +
                '}';
    }
}
