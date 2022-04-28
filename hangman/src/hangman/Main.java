package hangman;

import java.util.*;

public class Main {

    public static final String[] words = {
            "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE",
            "CASE", "CATCH", "CHAR", "CLASS", "CONST",
            "CONTINUE", "DEFAULT", "DOUBLE", "DO", "ELSE",
            "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY",
            "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS",
            "IMPORT", "INSTANCEOF", "INT", "INTERFACE",
            "LONG", "NATIVE", "NEW", "NULL", "PACKAGE",
            "PRIVATE", "PROTECTED", "PUBLIC", "RETURN",
            "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH",
            "SYNCHRONIZED", "THIS", "THROW", "THROWS",
            "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE"
    };

    public static final Random random = new Random();




    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String word = words[random.nextInt(words.length)].toLowerCase();
        System.out.println("H A N G M A N");

        List<Character> playerGuesses = new ArrayList<>();

        int wrongCount = 0;


        while(true) {

            printHangMan(wrongCount);

            if (wrongCount >= 6){
                System.out.println("You lose");
                System.out.println("The word was: " + word);
                break;
            }

            currentWordState(word, playerGuesses);
            if (!getPlayerGuess(userInput, word, playerGuesses)){
                wrongCount++;
            }

            if(currentWordState(word, playerGuesses)){
                System.out.println("You did it great job");
                break;
            }

        }

    }

    private static void printHangMan(int wrongCount) {
        System.out.println(" +---+");
        System.out.println(" |   |");
        if(wrongCount >= 1){
            System.out.println(" O");
        }
        if (wrongCount >= 2){
            System.out.print("\\ ");
            if (wrongCount >= 3){
                System.out.println("/");
            }
            else {
                System.out.println("");
            }
        }
        if (wrongCount >= 4){
            System.out.println(" |");
        }
        if (wrongCount >= 5){
            System.out.print("/ ");
            if (wrongCount >= 6){
                System.out.println("\\");
            }
            else {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");
    }

    private static boolean getPlayerGuess(Scanner userInput, String word, List<Character> playerGuesses) {
        System.out.println("Guess a Letter");


        String letterGuess = userInput.nextLine();
        playerGuesses.add(letterGuess.charAt(0));

        return word.contains(letterGuess);
    }

    private static boolean currentWordState(String word, List<Character> playerGuesses) {
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (playerGuesses.contains(word.charAt(i))){
                System.out.print(word.charAt(i));
                correctCount++;
            }
            else {
                System.out.print("_");

            }
        }
        System.out.println();


        return (word.length() == correctCount);
    }
}
