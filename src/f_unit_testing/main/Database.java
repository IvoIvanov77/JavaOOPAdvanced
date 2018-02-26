package f_unit_testing.main;

import java.util.Arrays;

public class Database {

    private final static int CAPACITY = 16;
    private Integer[] array;
    private int size;

    public Database(Integer... items) {
        this.setArray(items);
    }

    public void add(Integer item){
        if(this.size >= CAPACITY){
            throw new UnsupportedOperationException("Database is full");
        }
        this.array[this.size] = item;
        this.size ++;
    }

    public int getSize() {
        return size;
    }

    public Integer remove(){
        if(this.size <= 0){
            throw new UnsupportedOperationException("Database is full");
        }
        Integer last = this.array[this.size - 1];
        this.size --;
        this.array[this.size] = null;
        return last;
    }

    private void setArray(Integer[] items) {
        if(items.length > CAPACITY){
            throw new UnsupportedOperationException("Can not create database");
        }
        this.array = new Integer[CAPACITY];
        for (Integer item : items) {
            this.add(item);
        }
    }

    public int[] fetch () {
        return Arrays.stream(Arrays.copyOf(this.array, this.size))
                .mapToInt(Integer::valueOf)
                .toArray();
    }
}
