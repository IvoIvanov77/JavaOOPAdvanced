package a_interfaces_and_abstraction.exercises.collection_hierarchy.custom_collections;


import a_interfaces_and_abstraction.exercises.collection_hierarchy.interfaces.IAddCollection;

public class AddCollection extends AbstractCollection implements IAddCollection{


    @Override
    public int add(String item) {
        int index = super.getList().size();
        super.getList().add(item);
        return index;
    }
}
