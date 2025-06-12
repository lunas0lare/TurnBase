package guessing;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class TurnBase{

   public static void main(String[] args){
    Random rand = new Random();
    Scanner in = new Scanner(System.in);
    Human John = new Human();
    John.setHP(100);

    Computer computer = new Computer();
    computer.setHP(100);

    Move swing = new Swing();               // damage=10, healing=0; stamina = 5
    Move heavySwing = new heavySwing();     // damage=15, healing=0; stamina = 10
    Move healingPotion = new HealngPotion(); // damage=0, healing=10; stamina = 0
    Move staminaPotion = new StaminaPotion(); // damage=0; healing=0; stamina heals=15
    
    Boolean continue_playing = true;

    while(continue_playing == true){
        System.out.println("----------------------------------------------------\n");
    

        System.out.println("choose your move: \n");
        System.out.println("1. Swing: deals 10 damage");
        System.out.println("2. Heavy Swing: deals 15 damage");
        System.out.println("3. Health Potion: restore 15 health");
        System.out.println("4. Stamina Potion: restore 15 stamina");
        int option;
        while (true) {
        try {
            option = in.nextInt();
            if (option < 1 || option > 3) {
                System.out.println("Invalid choice. Please pick in range.");
                continue;
            }
        } catch (InputMismatchException e) {
            System.out.println("your move should be a number! please choose again");
            in.next();
            continue;
        }
        break;
    }
        switch(option){
        case 1:
        John.useMove(swing, computer);
        System.out.println("\ncomputer got hit by a swing! \n");
        break;
        case 2:
        John.useMove(heavySwing, computer);
        System.out.println("computer got hit by a heavy swing! \n");
        break;
        case 3:
        John.useMove(healingPotion, John);
        System.out.println("player healed! \n");
        break;
        default:
        System.out.println("player did not choose any moves in the list, it's computer's turn");
        break;
       }
        
        

        System.out.print("computer's move: ");
        int computerOption = rand.nextInt(3) + 1;
        switch(computerOption){
            case 1:
            computer.useMove(swing, John);
            System.out.println("player got hit by a swing! \n");
            break;
            case 2:
            computer.useMove(heavySwing, John);
            System.out.println("player got hit by a heavy swing! \n");
            break;
            case 3:
            computer.useMove(healingPotion, computer);
            System.out.println("computer healed! \n");
            break;
        }
      
        System.out.println("computer's HP: " + computer.getHP());
        
        System.out.println("computer's Stamina: " + computer.getStamina());

        System.out.println("Player's HP: " + John.getHP());
       
        System.out.println("Player's Stamina: " + John.getStamina());
        if(computer.getHP() <= 0 || John.getHP() <= 0){
            in.nextLine();//remove the space when input a string
            int johnHP = John.getHP();
            int compHP = computer.getHP();

           if(johnHP <= 0){
            System.out.println("computer wins!");
           }
           else if(compHP <= 0){
            System.out.println("John wins!\n");
           }
           else if(johnHP == compHP){
            System.out.println("it's a draw!");
           }
            while(true){
                System.out.println("\nDo you want to continue(y/n)?: ");
                String input = in.nextLine().toLowerCase();
                if(input.equals("y")){
                    continue_playing = true;
                    John.setHP(100);
                    computer.setHP(100);
                    break;
                }
                else if(input.equals("n")){
                    continue_playing = false;
                    break;
                }
                else{
                    System.out.println("Invalid input, please try again.");
                    
                }
       }
        }
        
        System.out.println("----------------------------------------------------\n");
    }
   }
}