 import java.util.Random;
import java.util.Scanner;
public class numberguessing{
    public static void main(String[] args){
        Random r=new Random();
        int randomnum=r.nextInt(50)+1;
        int guess=0;
        boolean win=false;
        System.out.println("Number Guessing Game");
        Scanner sc=new Scanner(System.in);
        while(!win && guess<10){
            System.out.print("Enter your guess (between 1 and 50): ");
            int Guess=sc.nextInt();
            guess++;
            if(Guess>randomnum){
                System.out.println("Your guess is too high than the actual number!!");
            }else if(Guess<randomnum){
                System.out.println("Your guess is too low than the actual number!!");
            }else{
                win=true;
            }
        }
        if(win){
            System.out.println("Wohhh!! The number you guessed is correct.");
        }else{
            System.out.println("Oops! You exceeded the maximum number of guesses. The actual number was " + randomnum );
        }
        sc.close();
    }
}