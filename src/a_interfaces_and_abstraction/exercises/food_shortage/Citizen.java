package a_interfaces_and_abstraction.exercises.food_shortage;

public class Citizen extends Human {

    Citizen(String name) {
        super(name);
    }

    @Override
    public void buyFood() {
        super.setFood(super.getFood() + 5);
    }
}