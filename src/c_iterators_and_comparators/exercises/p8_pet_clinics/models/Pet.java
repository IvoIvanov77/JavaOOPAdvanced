package c_iterators_and_comparators.exercises.p8_pet_clinics.models;

public class Pet {

//    name, an age and a kind

    private String name;
    private int age;
    private String type;

    public Pet(String name, int age, String type) {
        this.setName(name);
        this.setAge(age);
        this.setType(type);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", this.getName(), this.getAge(), this.getType());
    }
}
