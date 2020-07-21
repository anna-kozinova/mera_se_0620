public class Monster extends Personage{
    int power;
    public void act(Personage other){
        System.out.println("Монстр " + this.name + " атакует " + other.name " на " + power + " единиц урона урона ");
        other.setHealth(other.getHealth() - power);
    }

}
