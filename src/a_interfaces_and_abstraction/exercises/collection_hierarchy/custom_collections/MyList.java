package a_interfaces_and_abstraction.exercises.collection_hierarchy.custom_collections;

import a_interfaces_and_abstraction.exercises.collection_hierarchy.interfaces.IMyList;

public class MyList extends AbstractCollection implements IMyList {

    @Override
    public int used() {
        return super.getList().size();
    }

    @Override
    public String remove() {
        return super.getList().remove(0);
    }

    @Override
    public int add(String item) {
        this.getList().add(0, item);
        return 0;
    }
}
