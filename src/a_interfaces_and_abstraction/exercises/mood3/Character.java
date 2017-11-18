package a_interfaces_and_abstraction.exercises.mood3;

public abstract class Character implements ICharacter{

    private String	username;
	private String hashedPassword;
	private int level;


    public Character(String username, int level, Number specialPoints) {
        this.username = username;
        this.level = level;

    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public int getLevel() {
        return this.level;
    }


    @Override
    public String toString() {
      return String.format(
              "%s | %s -> %s",
              this.getUsername(), this.getHashedPassword(), this.getClass().getSimpleName()

      );
    }
}
