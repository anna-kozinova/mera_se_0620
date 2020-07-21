import java.util.ArrayList;
import java.util.Random;

public class Scene {
    public static int MAX_PERSONAGE_COUNT = 10;
    Personage[] field = new Personage[MAX_PERSONAGE_COUNT];
    ArrayList<Personage> personageList = new ArrayList<Personage>();

    private Random rand = new Random();

    public  Personage getRandomPerson()
    {
        int randPosition;
        randPosition = rand.nextInt(personageList.size());
        return field[randPosition];
    }

    public void addPersonage(Personage personToAdd){
        if (personageList.size() > MAX_PERSONAGE_COUNT - 1){
            System.out.println("Сцена заполнена, не могу добавить персонажа!");
            return;
        }

        int positionToAdd = rand.nextInt(MAX_PERSONAGE_COUNT);
        while (field[positionToAdd] != null)  {
            positionToAdd = rand.nextInt(MAX_PERSONAGE_COUNT);
        }
        personageList.add(personToAdd);
        field[positionToAdd] = personToAdd;

    }
    public void removePersonage(Personage personageToRemove)
    {
        personageList.remove(personageToRemove);
        for (int i = 0; i < MAX_PERSONAGE_COUNT; i++) {
            if(field[i] == personageToRemove){
                field[i] = null;
            }
        }
    }



    public int getPersonCount() {
        return personageList.size();
    }


}
