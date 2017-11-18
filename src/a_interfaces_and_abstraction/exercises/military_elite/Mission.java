package a_interfaces_and_abstraction.exercises.military_elite;

import a_interfaces_and_abstraction.exercises.military_elite.interfaces.IMission;

public class Mission implements IMission{

//    code name and a state (inProgress or Finished).
    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public void setState(String state) {
//        inProgress or Finished
        if("inProgress".equals(state) || "Finished".equals(state)){
            this.state = state;
        }else {
            throw new IllegalArgumentException("");
        }
    }

    @Override
    public void CompleteMission() {
        this.setState("Finished");
    }

    @Override
    public String toString() {
        return String.format(
                "Code Name: %s State: %s",
                this.getCodeName(), this.getState()
                );
    }
}
