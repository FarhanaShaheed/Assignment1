import java.util.ArrayList;
import java.util.List;

public class WordSorting {

    public static void main(String[] args) {
        String soliloquy = "To be, or not to be, that is the question:\n"
                + "Whether 'tis nobler in the mind to suffer\n"
                + "The slings and arrows of outrageous fortune,\n"
                + "Or to take arms against a sea of troubles\n"
                + "And by opposing end them.";

        // Extract words based on the defined criteria
        List<String> words = extractWords(soliloquy);

        // Convert to array for sorting
        String[] wordsArray = words.toArray(new String[0]);

        // Sort the words using bubble sort
        bubbleSort(wordsArray);

        // Print sorted words
        for (String word : wordsArray) {
            System.out.println(word);
        }
    }

    /**
     * Extracts words from the given text.
     * A "word" is defined as a sequence of alphabetic characters.
     * Words are case-insensitive and converted to lowercase.
     * Non-alphabetic characters are treated as delimiters.
     * 
     * @param text The input text to extract words from.
     * @return A list of extracted words.
     */
    private static List<String> extractWords(String text) {
        List<String> words = new ArrayList<>();
        // Split by non-alphabetic characters
        String[] tokens = text.split("[^a-zA-Z]+");

        for (String token : tokens) {
            if (!token.isEmpty()) {
                // Convert to lowercase
                words.add(token.toLowerCase());
            }
        }

        return words;
    }

    /**
     * Sorts an array of strings using the bubble sort algorithm.
     * 
     * @param array The array of strings to be sorted.
     */
    private static void bubbleSort(String[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    // Swap the elements
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
