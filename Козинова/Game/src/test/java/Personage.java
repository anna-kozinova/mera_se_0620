public abstract class Personage {

    int health;
    String name;


    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean isAlive(){
        return (health > 0);
    }

    public abstract void act(Personage other);

}
