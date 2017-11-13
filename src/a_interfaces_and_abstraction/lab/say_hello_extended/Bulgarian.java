package a_interfaces_and_abstraction.lab.say_hello_extended;

public class Bulgarian extends BasePerson implements Person {

    Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}