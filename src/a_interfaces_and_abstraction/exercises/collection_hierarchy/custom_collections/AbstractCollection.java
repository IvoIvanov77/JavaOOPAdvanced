package a_interfaces_and_abstraction.exercises.collection_hierarchy.custom_collections;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractCollection {

    private List<String> list;

    protected AbstractCollection() {
        this.list = new LinkedList<String>();
    }

    protected List<String> getList() {
        return this.list;
    }
}
