package c_iterators_and_comparators.exercises.p9_linked_list_traversal;

public interface List<T> extends Iterable<T>{

    void add(T item);
    boolean remove(T item);
    int getSize();


}
