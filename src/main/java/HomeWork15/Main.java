package HomeWork15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Author[] authors = {
                new Author("Katie Sierra", (short) 23),
                new Author("Bert Bates", (short) 34),
                new Author("John Ronald Reuel Tolkien", (short) 24),
                new Author("Joanne Rowling", (short) 38),
                new Author("Lev Tolstoy", (short) 44)
        };

        Book[] books = {
                new Book("Learning Java", 799),
                new Book("War and Peace. Volume 1", 200),
                new Book("War and Peace. Volume 2", 300),
                new Book("War and Peace. Volume 3", 350),
                new Book("War and Peace. Volume 4", 380),
                new Book("Anna Karenina", 144),
                new Book("The Lord of the Rings", 1000),
                new Book("Harry Potter", 1300)
        };


        books[0].addAuthors(authors[0], authors[1]);
        for (int i = 1; i < 6; i++) {
            books[i].addAuthors(authors[2]);
        }
        books[6].addAuthor(authors[2]);
        books[7].addAuthor(authors[3]);

        System.out.println("3.a. check if some/all book(s) have more than 200 pages;");
        Arrays.stream(books)
                .filter(n -> n.getNumberOfPages() > 200)
                .map(Book::getTitle)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n3.b. find the books with max and min number of pages");
        Book maxPages = Arrays
                .stream(books)
                .max((pages1, pages2) ->
                        pages1.getNumberOfPages() > pages2.getNumberOfPages() ? 1 : -1)
                .get();
        System.out.println("book with max number of pages is: " + maxPages.getTitle());


        Book minPages = Arrays
                .stream(books)
                .min((pages1, pages2) ->
                        pages1.getNumberOfPages() > pages2.getNumberOfPages() ? 1 : -1)
                .get();
        System.out.println("book with min number of pages is: " + minPages.getTitle());


        Optional<Book> minPagesSecondImplement = Arrays
                .stream(books)
                .min(Comparator.comparing(Book::getNumberOfPages));
        System.out.println("book with min number of pages is(second solution): " + minPagesSecondImplement.get());

        System.out.println("\n3.c. filter books with only single author;");
        Arrays.stream(books)
                .filter(p -> p.getAuthors().size() == 1)
                .map(Book::getTitle)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n3.d.1 sort the books by number of pages");
        Arrays.stream(books)
                .map(Book::getNumberOfPages)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nsecond solution with comparator");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getNumberOfPages);
        Arrays.sort(books, comparator);
        Arrays.asList(books)
                .forEach(System.out::println);



        System.out.println("\n3.d.2 sort the books by title");
        Arrays.stream(books)
                .map(Book::getTitle)
                .sorted()
                .forEach(System.out::println);


        System.out.println("\n3.e. get list of all titles + f. print them using forEach method");
        Arrays.stream(books)
                .map(Book::getTitle)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n3g. get distinct list of all authors");
        Arrays.stream(books)
                .map(Book::getAuthors)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n4. Use peek method for debugging intermediate streams during execution the previous task.");
        Arrays.stream(books)
                .filter(n -> n.getNumberOfPages() > 200)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(Book::getTitle)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println("\n5. Use parallel stream with subtask #3.");
        Arrays.stream(books)
                .parallel()
                .filter(p -> p.getAuthors().size() == 1)
                .map(Book::getTitle)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


}
