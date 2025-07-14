public class Pet {
    private String name;
    private String species;
    private int age;
    boolean isAdopted;

    public Pet(String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
        this.isAdopted = false;
    }

    public void setAdopted(boolean newAdopt){
        this.isAdopted = newAdopt;
        if(this.isAdopted){
            System.out.println("Congratulations you adopted "+this.name+"!");
        }
        else{
            System.out.println("Returned "+this.name);
        }
    }
    public void displayInfo(){
        System.out.println(name+"\tSpecies: "+species +"\t"+"Age: "+age);
    }
    public boolean getAdopted(){
        return this.isAdopted;
    }
    public String getName(){
        return this.name;
    }

}
