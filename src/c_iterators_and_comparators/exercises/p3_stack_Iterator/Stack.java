package c_iterators_and_comparators.exercises.p3_stack_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack<T> implements IStack<T>, Iterable<T> {

    private List<T> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    @Override
    public void push(T item) {
        this.list.add(item);
    }

    @Override
    public T pop() {
        if(this.list.isEmpty()){
            throw new UnsupportedOperationException("No elements");
        }
        int lastIndex = this.list.size() - 1;
        return this.list.remove(lastIndex);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = list.size() - 1;
            @Override
            public boolean hasNext() {
                return this.index >= 0;
            }

            @Override
            public T next() {
                return list.get(index --);
            }
        };
    }
}
