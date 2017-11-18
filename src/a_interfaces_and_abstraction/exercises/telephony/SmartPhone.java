package a_interfaces_and_abstraction.exercises.telephony;

public class SmartPhone implements Callable, Browsable {

    SmartPhone() {}

    @Override
    public String call(String number) {
        if (number.matches("\\d*")) {
            return "Calling... " + number;
        } else {
            return "Invalid number!";
        }
    }

    @Override
    public String browse(String url) {
        if (url.matches("\\D*")) {
            return "Browsing: " + url + "!";
        } else {
            return "Invalid URL!";
        }
    }
}