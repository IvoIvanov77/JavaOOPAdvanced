package a_interfaces_and_abstraction.exercises.collection_hierarchy.custom_collections;

import a_interfaces_and_abstraction.exercises.collection_hierarchy.interfaces.IAddRemoveCollection;

public class AddRemoveCollection extends AbstractCollection implements IAddRemoveCollection {

    @Override
    public String remove() {
        int index = super.getList().size() - 1;
        return super.getList().remove(index);
    }

    @Override
    public int add(String item) {
        this.getList().add(0, item);
        return 0;
    }
}
