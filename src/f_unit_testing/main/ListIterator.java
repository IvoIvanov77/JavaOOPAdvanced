package f_unit_testing.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterator {

    private List<String> strings;
    private int index;


    public ListIterator(String ... strings) {
        this.setStrings(strings);
        this.index = 0;
    }

    private void setStrings(String... strings) {
        if(strings == null){
            throw new UnsupportedOperationException("Invalid Operation!");
        }
        this.strings = new ArrayList<>(Arrays.asList(strings));

    }

    public boolean move(){
        if(this.index >= this.strings.size()){
            return false;
        }
        this.index ++;
        return true;
    }

    public boolean hasNext() {
        return this.index < this.strings.size();
    }


    public String print() {
        if(this.strings.isEmpty()){
            throw new UnsupportedOperationException("Invalid Operation!");
        }
        return this.strings.get(this.index);
    }
}
