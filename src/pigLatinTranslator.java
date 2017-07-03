import java.util.Scanner;

/**
 * Created by Feras on 6/30/2017.
 */


public class pigLatinTranslator {



    public static void main(String[] args) {

        //CHECKLIST
        // 1. Display welcome message
        System.out.println("Welcome to the Pig Latin Translator!");

        // 2. Prompt user input
        System.out.println("Enter a word to be translated: ");

        // 3. Get user input
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        // 3.1 Validate user input

        // 4. Translate user Input

        // 4.1 Two different algorithms for consonants and vowels (methods?)
        userInput = userInput.toLowerCase();

        String result;
        if (isVowels(userInput)) {
            result = piggifiedVowels(userInput);

        } else {    //consonant
            result = piggifiedConsonants(userInput);
        }

        //5. Display result
        System.out.println(userInput + " piggified is " /*+ piggifiedWord*/);

        //6. Prompt user to continue
        System.out.println("Piggify some more words?(y/n)");

        //7. Loop function


    }

    private static String piggifiedConsonants(String userInput) {

        return userInput;
    }

    private static String piggifiedVowels(String userInput) {

        return userInput;
    }

    private static boolean isVowels(String userInput){
        if (userInput.charAt(0) == 'a' || userInput.charAt(0) == 'e' || userInput.charAt(0) == 'i' ||
                userInput.charAt(0) == 'o' || userInput.charAt(0) == 'u') {
            return true;
        }
        
        return false;
    }
}
