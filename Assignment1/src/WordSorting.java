import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSorting {

    public static void main(String[] args) {
        String soliloquy = "To be, or not to be, that is the question:\n"
                + "Whether 'tis nobler in the mind to suffer\n"
                + "The slings and arrows of outrageous fortune,\n"
                + "Or to take arms against a sea of troubles\n"
                + "And by opposing end them.";

        // Define words as sequences of alphabetic characters
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

    private static List<String> extractWords(String text) {
        List<String> words = new ArrayList<>();
        String[] tokens = text.split("[^a-zA-Z]+"); // Split by non-alphabetic characters

        for (String token : tokens) {
            if (!token.isEmpty()) {
                words.add(token.toLowerCase()); // Convert to lowercase
            }
        }

        return words;
    }

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
