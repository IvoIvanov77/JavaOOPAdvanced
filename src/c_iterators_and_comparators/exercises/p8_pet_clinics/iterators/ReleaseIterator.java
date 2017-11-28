package c_iterators_and_comparators.exercises.p8_pet_clinics.iterators;

import java.util.Iterator;

public class ReleaseIterator<T> implements Iterator<T> {

    private final T[] collection;
    private int leftIndex;
    private int rightIndex;
    private boolean flag;

    public ReleaseIterator(T[] collection) {
        this.collection = collection;
        this.leftIndex = 0;
        this.rightIndex = this.collection.length / 2;
        this.flag = true;
    }


    @Override
    public boolean hasNext() {
        if(flag){
            return this.rightIndex < this.collection.length;
        }
        return this.leftIndex < this.collection.length / 2;
    }

    @Override
    public T next() {
        if(flag){
            if(this.rightIndex >= this.collection.length - 1){
                flag = false;
            }
            return collection[rightIndex ++];
        }

        return collection[leftIndex ++];
    }
}
