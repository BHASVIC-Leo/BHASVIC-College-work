
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char playerChoice;
        int newAge;
        String petChoice, newName, newSpecies;
        boolean exit = false;
        //I realised it's spelt centre too late and the files were getting annoyed at me for trying to change the name
        Adoption_center adoption_centre = new Adoption_center();
        System.out.println("Welcome to the pet adoption centre!");
        do {
            System.out.println("What would you like to do:\na) View animals\tb) Adopt a pet\tc) Return pet\td) Add pet\te) Exit");
            playerChoice = read.nextLine().charAt(0);
            if (playerChoice == 'a') {
                adoption_centre.displayAvailablePets();
            }
            else if (playerChoice == 'b') {
                System.out.println("What animal?");
                petChoice = read.nextLine();
                adoption_centre.getPet(petChoice).setAdopted(true);
            }
            else if (playerChoice == 'c') {
                System.out.println("Which pet?");
                petChoice = read.nextLine();
                if(adoption_centre.getPet(petChoice).getAdopted()){
                    System.out.println("You have not adopted this animal");
                }
                else{
                    adoption_centre.getPet(petChoice).setAdopted(false);
                }
            }
            else if (playerChoice == 'd') {
                System.out.println("What name?");
                newName = read.nextLine();
                System.out.println("What species?");
                newSpecies = read.nextLine();
                System.out.println("How old");
                newAge = Integer.parseInt(read.nextLine());
                Pet pet = new Pet(newName, newSpecies, newAge);
                adoption_centre.addPet(pet);
            }
            else if (playerChoice == 'e') {
                System.out.println("Exiting adoption centre");
            }
            else  {
                System.out.println("Invalid input!");
            }
        }while(!exit);

    }
}
