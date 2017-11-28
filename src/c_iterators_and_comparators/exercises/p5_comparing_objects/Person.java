package c_iterators_and_comparators.exercises.p5_comparing_objects;

public class Person implements Comparable<Person> {

//    have a name, an age and a town

    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person other) {
        if(this.name.compareTo(other.name) == 0){
            if(Integer.compare(this.age, other.age) == 0){
                return this.town.compareTo(other.town);
            }
            return Integer.compare(this.age, other.age);
        }

        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return town != null ? town.equals(person.town) : person.town == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (town != null ? town.hashCode() : 0);
        return result;
    }
}
