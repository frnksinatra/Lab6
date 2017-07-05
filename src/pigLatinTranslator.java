import java.util.Scanner;

/**
 * Created by Feras on 6/30/2017.
 */


public class pigLatinTranslator {
    public static void main(String[] args) {



        wecomingStatement();

        getTranslation();





    }

    private static void wecomingStatement() {
        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.println("Enter a word to be translated: ");
    }

    private static  void getTranslation(){
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine().toLowerCase();
        StringBuffer translatedUserInput = new StringBuffer(userInput);

        if (isVowels(userInput)) {
            translatedUserInput.append("way");

        }else {
            translatedUserInput = isConsonant(userInput);

        }

        System.out.println(translatedUserInput);
    }

    private static void loop () {

    }

    private static boolean isVowels(String userInput) {
        if (userInput.charAt(0) == 'a' || userInput.charAt(0) == 'e' || userInput.charAt(0) == 'i' ||
                userInput.charAt(0) == 'o' || userInput.charAt(0) == 'u') {
            return true;
        }

        return false;
    }

    private static StringBuffer isConsonant (String userInput){
        StringBuffer translatedConsonants = new StringBuffer(userInput);

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' ||
                    userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u'){

                translatedConsonants = translatedConsonants.append(translatedConsonants.subSequence(0,i) + ("ay"));
                translatedConsonants.delete(0,i);
                return translatedConsonants;

            }
        }

        return translatedConsonants;
    }




}


