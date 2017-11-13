package a_interfaces_and_abstraction.lab.say_hello_extended;

public class Chinese extends BasePerson implements Person {

    Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
