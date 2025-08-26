import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args){

        //Declaring variables.
        int timesRolled;
        int total = 0;

        //Main functioning code.
        System.out.print("Enter the number of dice to roll: ");
        timesRolled = scanner.nextInt();

        //Validate input(can't have a negative number)
        while(timesRolled < 1){
            System.out.print("\nNumber can't be negative, or zero, please try again: ");
            timesRolled = scanner.nextInt();
        }

        System.out.println("Rolling " + timesRolled + " dice...");

        for(int i = 0; i < timesRolled; i++){
            int diceRoll = random.nextInt(1, 7);
            System.out.println("\nYou rolled a " + diceRoll);

            switch(diceRoll){
                case 1 -> {
                    System.out.println("-------");
                    System.out.println("|     |");
                    System.out.println("|  ●  |");
                    System.out.println("|     |");
                    System.out.println("-------");
                    total += 1;
                }
                case 2 -> {
                    System.out.println("-------");
                    System.out.println("|   ● |");
                    System.out.println("|     |");
                    System.out.println("| ●   |");
                    System.out.println("-------");
                    total += 2;
                }
                case 3 -> {
                    System.out.println("-------");
                    System.out.println("|●    |");
                    System.out.println("|  ●  |");
                    System.out.println("|    ●|");
                    System.out.println("-------");
                    total += 3;
                }
                case 4 -> {
                    System.out.println("-------");
                    System.out.println("|●   ●|");
                    System.out.println("|     |");
                    System.out.println("|●   ●|");
                    System.out.println("-------");
                    total += 4;
                }
                case 5 -> {
                    System.out.println("-------");
                    System.out.println("|●   ●|");
                    System.out.println("|  ●  |");
                    System.out.println("|●   ●|");
                    System.out.println("-------");
                    total += 5;
                }
                case 6 -> {
                    System.out.println("-------");
                    System.out.println("|●   ●|");
                    System.out.println("|●   ●|");
                    System.out.println("|●   ●|");
                    System.out.println("-------");
                    total += 6;
                }
                default -> System.out.println("error");
            }
        }

        System.out.println("\nThe total is " + total);
        
        scanner.close();
    }
}
