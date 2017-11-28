package d_enumerations_and_anotations.lab.coffee_machine;

public interface ICoffeeMachine {

    void buyCoffee(String size, String type);
	void insertCoin(String coin);
	Iterable<Coffee> coffeesSold();

}
