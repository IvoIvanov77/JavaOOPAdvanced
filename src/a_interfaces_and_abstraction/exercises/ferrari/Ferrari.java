package a_interfaces_and_abstraction.exercises.ferrari;

public class Ferrari implements Car{

    private final static String MODEL = "488-Spider";
    private String driverName;

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String useBreak() {
        return "Brakes!";
    }

    @Override
    public String pushPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", MODEL, this.useBreak(),
                this.pushPedal(), this.driverName);
    }
}
