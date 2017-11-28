package c_iterators_and_comparators.lab.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String ... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(String ... authors) {

        this.authors = new ArrayList<>(Arrays.asList(authors));

    }

    @Override
    public int compareTo(Book o) {
        if(this.getTitle().compareTo(o.getTitle()) == 0){
            return this.getYear() - o.getYear();
        }
        return this.getTitle().compareTo(o.getTitle());
    }
}
