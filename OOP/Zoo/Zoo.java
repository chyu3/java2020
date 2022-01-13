import java.util.ArrayList;

public class Zoo
{
    // aggregation: Zoo has Animal (1 Zoo has 0 or many Animal objects)
    private ArrayList<Animal> animals = new ArrayList<>();
    private String zooName;

    public Zoo() { }

    public Zoo(String zooName)
    {
        this.zooName = zooName;
    }

    public Zoo(ArrayList<Animal> animals)
    {
        this.animals = animals;
    }

    public Zoo(ArrayList<Animal> animals, String zooName)
    {
        this.animals = animals;
        this.zooName = zooName;
    }

    public ArrayList<Animal> getAnimals()
    {
        return animals;
    }

    public void setAnimal(ArrayList<Animal> animals)
    {
        this.animals = animals;
    }

    public void setAnimal(Animal animal, int i)
    {
        this.animals.set(i, animal);
    }

    public void addAnimal(Animal animal)
    {
        this.animals.add(animal);
    }

    // what does the method do
    public boolean remove(int i)
    {
        if( i < animals.size() )
        {
            this.animals.remove(i);
            return true; // successful deletion
        }
        return false;
    }

    public String getZooName()
    {
        return zooName;
    }

    public void setZooName(String zooName)
    {
        this.zooName = zooName;
    }

    @Override
    public String toString()
    {
        String list = "";
        //for(Animal a : animals)
        for(int i = 0; i < animals.size(); i++)
        {
            list = list + i + "\t" + animals.get(i).toString() + "\n";
        }
        return zooName + " Zoo: \n" + list;
    }
}
