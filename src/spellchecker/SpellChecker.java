package spellchecker;

import java.util.Scanner;

public class SpellChecker {

    // Sample dictionary of correct words
    private static String[] dictionary = {"hello", "world", "java", "programming", "example"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence to check for spelling errors:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        System.out.println("Spelling errors:");

        for (String word : words) {
            if (!isWordInDictionary(word)) {
                System.out.println(word);
            }
        }

        scanner.close();
    }

    private static boolean isWordInDictionary(String word) {
        for (String dictionaryWord : dictionary) {
            if (dictionaryWord.equals(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
