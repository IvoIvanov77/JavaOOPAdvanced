package osp_lsp.lab.P01_ExtendedArrayList;

import java.util.ArrayList;

public class ExtendedArrayList<T extends Comparable<T>> extends ArrayList<T>{


    public T min(){
        T min = null;

        for (T item : this) {
            if(min == null || min.compareTo(item) > 0){
                min = item;
            }
        }
        return min;
    }


    public T max(){
        T max = null;

        for (T item : this) {
            if(max == null || max.compareTo(item) < 0){
                max = item;
            }
        }
        return max;
    }





}
