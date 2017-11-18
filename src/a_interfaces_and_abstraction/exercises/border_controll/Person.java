package a_interfaces_and_abstraction.exercises.border_controll;

public class Person implements Identifiable {

    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String getID() {
        return this.id;
    }
}
