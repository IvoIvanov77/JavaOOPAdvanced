package c_iterators_and_comparators.exercises.p4_froggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    private int[] array;
    private int startIndex;

    public Lake(int... items) {
        this.array = items;
    }

    @Override
    public Frog iterator() {
        return new Frog(this.startIndex);
    }

    public List<Integer> jump(){
        List<Integer> list = new ArrayList<>();
        this.startIndex = 0;
        for (Integer s : this) {
            list.add(s);
        }
        this.startIndex = 1;
        for (Integer s : this) {
            list.add(s);
        }
        return list;
    }

    private class Frog implements Iterator<Integer>{

        private int start;

        public Frog(int start) {
            this.start = start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        @Override
        public boolean hasNext() {
            return this.start  < array.length;
        }

        @Override
        public Integer next() {
//            System.out.println(start);
            int item = array[start];
            this.start += 2;
            return item;
        }
    }
}
