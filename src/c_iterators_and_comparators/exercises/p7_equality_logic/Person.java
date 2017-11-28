package c_iterators_and_comparators.exercises.p7_equality_logic;

public class Person implements Comparable<Person> {

//    have a name, an age and a town

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        if(this.name.compareTo(other.name) == 0){
            return Integer.compare(this.age, other.age);
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return age == person.age && (name != null ? name.equals(person.name) : person.name == null);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
