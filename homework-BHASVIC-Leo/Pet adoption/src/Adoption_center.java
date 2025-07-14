import java.util.ArrayList;
public class Adoption_center {
    ArrayList<Pet> petsArray = new ArrayList<>();
    public Adoption_center() {
        petsArray.add(new Pet("Milo", "Cat", 3));
        petsArray.add(new Pet("Bella", "Dog", 5));
        petsArray.add(new Pet("Zazu", "Parrot", 2));
        petsArray.add(new Pet("Nemo", "Clownfish", 1));
        petsArray.add(new Pet("Luna", "Rabbit", 4));
        petsArray.add(new Pet("Rocky", "Hamster", 2));
        petsArray.add(new Pet("Sonic", "HedgeHog", 6));
        petsArray.add(new Pet("Coco", "Turtle", 80));
        petsArray.add(new Pet("Max", "Ferret", 3));

    }
    public void addPet(Pet pet){
        petsArray.add(pet);
    }
    public Pet getPet(String name){
        for(int i=0;i<petsArray.size();i++) {
            if (petsArray.get(i).getName().equals(name)) {
                return petsArray.get(i);
            }
        }
        return null;
    }
    public void displayAvailablePets(){
        for(int i=0;i<petsArray.size();i++){
            if(!petsArray.get(i).getAdopted()){
                petsArray.get(i).displayInfo();
            }
        }
    }
}
