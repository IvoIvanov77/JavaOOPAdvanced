package d_enumerations_and_anotations.lab.warning_levels;

public class Message {

    private Importance importance;
    private String message;

    public Message(String importance, String message) {
        this.importance = Importance.valueOf(importance.toUpperCase());
        this.message = message;
    }



    public Importance getImportance() {
        return importance;
    }

    public String getMessage() {
        return message;
    }

//    public static Comparator<Message> byImportance(){
//        return Comparator.comparing(Message::getImportance);
//    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.getImportance(), this.getMessage());
    }
}
