package b_generics.exercises.generic_box;

public class GenericBox<T> {

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return String.format("%s: %s", value.getClass().getName(), this.value.toString());
    }
}
