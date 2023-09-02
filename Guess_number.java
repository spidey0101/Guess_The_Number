package company.com;

import java.util.Random;
import java.util.Scanner;

class Game {

    public int number;
    public int user;
    public int count = 0;



    public int getcount() {
        return count;
    }

    public void setCount(int count) {
     this.count =count;
    }


    public Game() {
        System.out.println("Welcome to our Game !");
        System.out.println("The rules are simple, you  just have to guess the number");

        Random rand = new Random();

        this.number = rand.nextInt(100);


        
    }
    void  userInput() {
        System.out.println("Enter your guess : ");
        Scanner sc = new Scanner(System.in); {
            this.user = sc.nextInt();
        }
        
    }
    boolean isCorrectNumber() {
        count++;
        if(user == number) {
            System.out.println("Your guessed the right number, which is "+ number + " in "+ count + " attempts.");
        return true;
        }
        else if (user< number) {
            System.out.println("Too low");
        }
        else if(user > number) {
            System.out.println("Too High");
        }
        return false;
   }

    



public class Guess_number {
    public static void main(String[] args) {
        Game g  = new Game();

        boolean b = false;

        while(!b){
                g.userInput();
             b  = g.isCorrectNumber();
        }
        
    }
}
}