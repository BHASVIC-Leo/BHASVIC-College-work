
public class Animal {
    private String animalName;
    private String animalEmoji;
    private Player animalOwner;
    private int cost;
    private int level;

    public Animal(String name, String emoji, Player owner, int price) {
        animalName = name;
        animalEmoji = emoji;
        animalOwner = owner;
        cost = price;
        level = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalEmoji() {
        return animalEmoji;
    }

    public String getAnimalOwner() {
        if (animalOwner == null) {
            return "None";
        }
        return animalOwner.getName();
    }
    public Player getAnimalOwnerP(){
        return animalOwner;
    }

    public void setAnimalOwner(Player newOwner) {
        animalOwner = newOwner;
    }

    public int getCost() {
        return cost;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int newLevel) {
        level = newLevel;
    }

    public int getVisitPrice() {
        if(animalOwner.getName().equals("None")){ // if there is no owner, visit price is 0
            return 0;
        }
        else{
            if(level == 0){ // price is 10% cost at level 0
                return cost / 10;
            }
            else if(level == 1){ // price is 30% cost at level 1
                return (cost / 10) * 3;
            }
            else if(level == 2){ // price is equal to cost at level 2
                return cost;
            }
            else{ // level = 3 // price is equal to 250% cost at level 3
                return (cost / 2) * 5;
            }
        }
    }
}
