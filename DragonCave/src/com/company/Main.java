package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


         System.out.println("You are in a land full of dragons. In front of you, you see two caves.\n" +
                 "In one cave, the dragon is friendly and will share his treasure with you.\n" +
                 "The other dragon is greedy and hungry and will eat you in sight.\n" +
                 "Which cave will you go into? (1 or 2)");

         Scanner input = new Scanner(System.in);
         int chooseWisely = input.nextInt();

         if (chooseWisely == 1) {
             System.out.println("You approach the cave...\n" +
                     "It is dark and spooky...\n" +
                     "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                     "Gobbles you down in one bite!\n");
         } else if (chooseWisely == 2) {
             System.out.println("You approach the cave...\n" +
                     "It is dark and spooky...\n" +
                     "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                     "Rolls their eyes at you and turns back in to their cave.\n");

         } else {
             System.out.println("Oops you messed up.");
         }

    }
}
