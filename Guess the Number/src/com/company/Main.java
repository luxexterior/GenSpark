package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean playAgain = true;
        String userName = "";

        System.out.println("Hello, what is your name?");
        try {
            userName = input.nextLine();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println("Well, " + userName + ", I am thinking of a number between 1 and 20.");

        while (playAgain == true) {
           int attempt = 0;
           int guess = 0;
           int correctAnswer = ((int) (Math.random() * 20) + 1);

           while(guess != correctAnswer && attempt < 6) {
               System.out.println("Take a guess");
               try {
                   guess = Integer.parseInt(input.nextLine());
               } catch (Exception e) {
                   System.out.println("ERROR");
               }
               attempt++;

               if(guess < correctAnswer) {
                   System.out.println("Your guess is too low.");
               } else if (guess > correctAnswer) {
                   System.out.println("Your guess is too high.");
               } else if (guess == correctAnswer) {
                   System.out.println("Good job, " + userName + "! You guessed my number in " + attempt + " guesses!");
               } else {
                   System.out.println("Invalid input. Try again.");
               }
               if (attempt >= 6) {
                   System.out.println("Too many guesses. Better luck next time.");
               }
           }
            System.out.println("Would you like to play again? (y/n)");
           try {
               playAgain = input.nextLine().equals("y");
           } catch (Exception e) {
               System.out.println("ERROR");
           }
        }







    }
}
