package a_interfaces_and_abstraction.exercises.birthday_celebrations;

public class Pet implements Birthable {

    private String name;
    private String birthDay;

    public Pet(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String getBirthDay() {
        return this.birthDay;
    }
}
