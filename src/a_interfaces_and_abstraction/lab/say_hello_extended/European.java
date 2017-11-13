package a_interfaces_and_abstraction.lab.say_hello_extended;

public class European extends BasePerson implements Person {

    European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
