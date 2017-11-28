package c_iterators_and_comparators.lab.library;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Library implements Iterable<Book>{

    private Book[] books;

    public Library(Book ... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new Iterator<Book>() {

            private int counter = 0;

            @Override
            public boolean hasNext() {
                return this.counter < books.length;
            }

            @Override
            public Book next() {
                return books[counter ++];
            }
        };
    }

    public void sort(){
        Arrays.sort(this.books, new BookComparator());
    }

    public void sort(Comparator<Book> comparator){
        Arrays.sort(this.books, comparator);
    }
}
