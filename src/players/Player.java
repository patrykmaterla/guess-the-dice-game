package players;


public abstract class Player {

    private String name;

    public Player() {
        setName("Player");
    }
    public Player(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z0-9~.]{3,}$"))
            this.name = name;
        else {
            throw new IllegalArgumentException("Wrong name.");
        }
    }

    public abstract int guess();

}
