package c_iterators_and_comparators.exercises.p1_p2_listyIterator;

import java.util.Iterator;

public class ListyIterator<T> implements Iterable<T> {

    private T[] collection;
    private int index;

    public ListyIterator(T... collection) {
        this.collection = collection;
        this.index = 0;

    }

//    •	Move - should move an internal index position to the next index in the list, the method should
//    return true if it successfully moved and false if there is no next index.
//•	HasNext - should return true if there is a next index and false if the index is already at the last
//    element of the list.
//•	Print - should print the element at the current internal index, calling Print on a collection
//    without elements should throw an appropriate exception with the message "Invalid Operation!".

    public boolean move(){
        if(this.hasNext()){
            this.index ++;
            return true;
        }
        return false;
    }

    public boolean hasNext(){
       return this.index < this.collection.length - 1;
    }

    public String print(){
        if(this.collection.length == 0){
            throw new UnsupportedOperationException("Invalid Operation!");
        }
        return this.collection[index].toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        this.forEach(item ->  builder.append(item).append(" "));
        return builder.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index;

            @Override
            public boolean hasNext() {
                return this.index < collection.length;
            }

            @Override
            public T next() {
                return collection[this.index++];
            }
        };
    }
}
