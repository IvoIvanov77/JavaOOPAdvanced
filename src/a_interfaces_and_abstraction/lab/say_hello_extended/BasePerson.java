package a_interfaces_and_abstraction.lab.say_hello_extended;

public abstract class BasePerson implements Person {

    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public abstract String sayHello();
}