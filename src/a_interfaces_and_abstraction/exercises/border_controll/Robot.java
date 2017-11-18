package a_interfaces_and_abstraction.exercises.border_controll;

public class Robot implements Identifiable {

    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getID() {
        return this.id;
    }
}
