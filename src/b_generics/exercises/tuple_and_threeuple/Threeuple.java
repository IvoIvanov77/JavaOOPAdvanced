package b_generics.exercises.tuple_and_threeuple;

public class Threeuple<A, B, C> extends Tuple<A, B> {

    private C item3;

    public Threeuple(A item1, B item2, C item3) {
        super(item1, item2);
        this.item3 = item3;
    }

    public C getItem3() {
        return item3;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", super.toString(), this.getItem3());
    }
}
