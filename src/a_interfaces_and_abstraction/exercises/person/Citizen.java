package a_interfaces_and_abstraction.exercises.person;

public class Citizen implements Person{
    private String name;
    private Integer age;

    Citizen(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
}
