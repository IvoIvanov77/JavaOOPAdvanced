package a_interfaces_and_abstraction.exercises.food_shortage;

public class Rebel extends Human {

    Rebel(String name) {
        super(name);
    }

    @Override
    public void buyFood() {
        super.setFood(super.getFood() + 10) ;
    }
}