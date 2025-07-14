
public class Player {
    private String name;
    private String playingPiece;
    private int balance;
    private int position;
    private boolean alive = true;
    private Animal[] ownedAnimals = new Animal[26];

    public Player(String name, int playerID, String playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
        System.out.println("Test:"+name+playerID+playingPiece);
        this.alive = true;
        this.balance = 1500;
    }
    public void updateBal(int balChange){
        this.balance += balChange;
    }
    public int getBal(){
        return balance;
    }
    public void displayDetails(){
        System.out.println("Test:"+name+playingPiece);
    }
    public String getName(){
        return name;
    }
    public void updatePostition(int move){
        if(this.position+move>26){
            this.position = this.position+move-26;
            if(this.position!=0){
                System.out.println("Congratulations you have passed start and earned £500!");
                this.balance += 500;
            }
        }
        else{
            this.position = this.position+move;
        }
    }
    public int getPosition(){
        return this.position;
    }
    public void updateAlive(){
        this.alive = false;
    }
    public boolean getAlive(){
        return this.alive;
    }
    public String getSymbol(){
        return this.playingPiece;
    }
    public void addAnimal(Animal animal){
        for(int i=0;i<ownedAnimals.length;i++){
            if(ownedAnimals[i]==null){
                ownedAnimals[i]=animal;
                break;
            }
        }
        System.out.println("New animal list");
        for(int i=0;i<ownedAnimals.length;i++){
            if(ownedAnimals[i]!=null){
                System.out.println(ownedAnimals[i].getAnimalName());
            }
        }
    }
    public void removeAnimal(Animal animal){
        for(int i=0;i<ownedAnimals.length;i++) {
            if (ownedAnimals[i] == animal) {
                ownedAnimals[i] = null;
            }
        }
    }
    public Animal getOwnedA(int i){
        return this.ownedAnimals[i];
    }
}
