package c_iterators_and_comparators.exercises.p8_pet_clinics.iterators;

import java.util.Iterator;

public class AccommodationIterator<T> implements Iterator<T> {


    private final T[] collection;
    private int leftIndex;
    private int rightIndex;
    private boolean flag;


    public AccommodationIterator(T[] collection) {
        this.leftIndex = collection.length / 2 - 1;
        this.rightIndex = collection.length / 2;
        this.collection = collection;
        this.flag = true;
    }

    @Override
    public boolean hasNext() {
        if(flag){
            return this.rightIndex < this.collection.length;
        }
        return this.leftIndex >= 0;
    }

    @Override
    public T next() {
        if(flag){
            flag = false;
            return collection[rightIndex ++];
        }
        flag = true;
        return collection[leftIndex --];
    }
}
