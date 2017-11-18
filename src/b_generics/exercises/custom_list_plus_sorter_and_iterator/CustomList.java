package b_generics.exercises.custom_list_plus_sorter_and_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CustomList<T extends Comparable<T>> implements Iterable<T>{

    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element){
        this.list.add(element);
    }

    public T remove(int index){
        return this.list.remove(index);
    }

    public boolean contains(T element){
        return this.list.contains(element);
    }

    public void swap(int i, int j){
        T item = this.list.get(i);
        this.list.set(i, this.list.get(j));
        this.list.set(j, item);
    }

    public int countGreaterThan(T element){
        int count = 0;
        for (T t : this.list) {
            if(t.compareTo(element) > 0){
                count ++;
            }
        }
        return count;
    }

    public T getMax(){
        if(this.list.isEmpty()){
            return null;
        }
        T max = this.list.get(0);
        for (T t : this.list) {
            if(t.compareTo(max) > 0){
                max = t;
            }
        }
        return max;
    }

    public T getMin(){
        if(this.list.isEmpty()){
            return null;
        }
        T min = this.list.get(0);
        for (T t : this.list) {
            if(t.compareTo(min) < 0){
                min = t;
            }
        }
        return min;
    }

    public void sort() {
        this.list.sort(Comparable::compareTo);
    }

    @Override
    public String toString() {
        if(this.list.isEmpty()){
            return "";
        }
        StringBuilder b = new StringBuilder(this.list.get(0).toString());
        for (int i = 1; i < this.list.size(); i++) {
            b.append("\n").append(this.list.get(i));
        }
        return b.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public T next() {
                T item = list.get(index);
                index ++;
                return item;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }
}
