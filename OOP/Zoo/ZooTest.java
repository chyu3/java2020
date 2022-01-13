public class ZooTest
{
    public static void main(String[] args)
    {

        Zoo ofs = new Zoo("OFS");
        Animal newAnimal = new Animal("Dodo", 'M', 1811);
        ofs.addAnimal(newAnimal);
        System.out.println( ofs );
        newAnimal = new Dog("Dudu", 'f', 1888, "labrador");
        ofs.addAnimal(newAnimal);
        System.out.println( ofs );
        newAnimal = new Dog("Dada", 'f', 1877, "chihuahua");
        ofs.addAnimal(newAnimal);
        System.out.println( ofs );
        newAnimal = new Dog("DeeDee", 'm', 2002, "terrier");
        ofs.addAnimal(newAnimal);
        System.out.println( ofs );
        Dog newDog = new Dog("Fido", 'm', 2002, "dalmatian");
        ofs.addAnimal(newDog);
        ofs.remove(3);
        System.out.println( ofs );
        newAnimal = new Animal("Boba", 'f', 1999);
        ofs.setAnimal(newAnimal, 1);
        System.out.println( ofs );
    }
}
