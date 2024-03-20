import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog fluffy = new Dog("Fluffy", "pomeranian");
        fluffy.printPetInfo();
        ArrayList<Pet> petList = new ArrayList<Pet>();


        /* put your code segment for part (b) here */
        Pet pet1 = new Pet("Floppy", "rabbit");
        Dog pet2 = new Dog("Arty", "pug");

        petList.add(pet1);
        petList.add(pet2);
        PetOwner owner1 = new PetOwner(pet1, "Jerry");
        owner1.printOwnerInfo();
        PetOwner owner2 = new PetOwner(pet2, "Kris");
        owner2.printOwnerInfo();

        Plant p = new Plant("Aloe");
        Flower f = new Flower("Petunia", 10);
        Rose r = new Rose("Damask", 25, "pink");
        Plant[] garden = new Plant[3];
        garden[0] = p;
        garden[1] = f;
        garden[2] = r;


        for (Plant plant : garden) {
            System.out.println(plant.info());
        }
        System.out.println("-----------");
        f.losePetals(3);
        r.losePetals(5);
        System.out.println(f.info());
        System.out.println(r.info());
        System.out.println("-----------");
        System.out.println(p.getName());
        System.out.println(f.getName());
        System.out.println(r.getName());
        System.out.println(f.getPetals());
        System.out.println(r.getPetals());
        System.out.println(r.getColor());

        p.losePetals(2);
        System.out.println(p.getPetals());
        System.out.println(p.getColor());
        System.out.println(f.getColor());

    }
}