package d_enumerations_and_anotations.lab.warning_levels;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private List<Message> messages;
    private Importance level;

    public Logger(String level) {
        this.messages = new ArrayList<>();
        this.level = Importance.valueOf(level.toUpperCase());
    }

    public void add(Message message){
        if(message.getImportance().compareTo(this.level) >= 0){
            this.messages.add(message);
        }
    }

    public List<Message> getMessages() {
        return messages;
    }

    public Importance getLevel() {
        return level;
    }

    public Iterable<Message> messages(){
        return this.messages;
    }

}
