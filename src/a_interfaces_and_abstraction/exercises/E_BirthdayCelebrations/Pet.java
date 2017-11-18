package a_interfaces_and_abstraction.exercises.E_BirthdayCelebrations;

public class Pet implements Identificatable {

    private String birthDate;

    public Pet(String date) {
        this.birthDate = date;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
