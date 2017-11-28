package d_enumerations_and_anotations.lab.coffee_machine;

public enum  CoffeeSize {

//    Small (50 ml, 50 c), Normal (100 ml, 75 c), Double (200 ml

    SMALL(50, 50), NORMAL(100, 75), DOUBLE(200, 100);

    private int c;
    private int ml;

    CoffeeSize(int c, int ml) {
        this.c = c;
        this.ml = ml;
    }

    public int getPrice() {
        return c;
    }

    public int getMl() {
        return ml;
    }

    @Override
    public String toString() {
        return null;
    }
}
