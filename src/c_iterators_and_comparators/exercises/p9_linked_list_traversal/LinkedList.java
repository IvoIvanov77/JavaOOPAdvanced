package c_iterators_and_comparators.exercises.p9_linked_list_traversal;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {

    private Node first;
    private Node last;
    private int size;

    @Override
    public void add(T item) {
        Node node = new Node(item);
        if(this.size == 0){
            this.first = node;
        }else if(this.size == 1){
            this.first.next = node;
        }else{
            this.last.next= node;
        }
        this.last = node;
        this.size ++;

    }

    @Override
    public boolean remove(T item) {
       if(this.first.item.equals(item)){
           this.first = first.next;
           this.size --;
           return true;
       }
       Node current = this.first;
        while (current.next != null){
            if(current.next.item.equals(item)){
                current.next = current.next.next;
                this.size --;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            Node current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T item = current.item;
                current = current.next;
                return item;
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        this.forEach(item -> builder.append(item).append(" "));
        return builder.toString().trim();
    }

    private class Node{
        private T item;
        private Node next;

        public Node(T item) {
            this.item = item;
        }

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
