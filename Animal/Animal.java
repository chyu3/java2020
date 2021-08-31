public class Animal
{
    private char gender;
    private String species;
    private int yob;

    public Animal(String species, char gender, int yob)
    {
        this.gender = gender;
        this.species = species;
        this.yob = yob;
    }

    public char setGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = Character.toUpperCase(gender);
    }

    public String getSpecies()
    {
        return species;
    }

    public void setSpecies(String species)
    {
        this.species = species;
    }

    public int getYob()
    {
        return yob;
    }

    public void setYob(int yob)
    {
        this.yob = yob;
    }

    public void eat()
    {
        System.out.println("Munch munch");
    }

    public void talk()
    {
        System.out.println("Animals can't talk!");
    }

    @Override
    public String toString()
    {
        return "Animal: " + species +
                "\tgender=" + gender +
                "\t yob=" + yob;
    }

}
