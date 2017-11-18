package b_generics.exercises.generic_count_method_strings_and_doubles;

public class GenericBox<T extends Comparable<T>> {

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", value.getClass().getName(), this.value.toString());
    }
}
