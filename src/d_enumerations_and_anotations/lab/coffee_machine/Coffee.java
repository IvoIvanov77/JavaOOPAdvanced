package d_enumerations_and_anotations.lab.coffee_machine;

public class Coffee {

    private CoffeeSize coffeeSize;
    private CoffeeType type;

    public Coffee(CoffeeSize coffeeSize, CoffeeType type) {
        this.coffeeSize = coffeeSize;
        this.type = type;
    }

    public int getPrice(){
        return this.coffeeSize.getPrice();
    }
}
