package c_iterators_and_comparators.lab.library;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {


    @Override
    public int compare(Book first, Book second) {
        if(first.getTitle().compareTo(second.getTitle()) == 0){
            return Integer.compare(first.getYear(), second.getYear());
        }
        return first.getTitle().compareTo(second.getTitle());
    }
}
