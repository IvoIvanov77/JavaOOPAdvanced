package a_interfaces_and_abstraction.exercises.birthday_celebrations;

public class Person implements Identifiable, Birthable {

    private String name;
    private int age;
    private String id;
    private String birthDay;

    public Person(String name, int age, String id, String birthDay) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDay = birthDay;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getBirthDay() {
        return this.birthDay;
    }
}
