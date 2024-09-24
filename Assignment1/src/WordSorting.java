public class WordSorting {
    public static void main(String[] args) {
        // Reuse the soliloquy text from Problem 3
        String text = "To be or not to be, that is the question;"
                    + " Whether 'tis nobler in the mind to suffer"
                    + " the slings and arrows of outrageous fortune,"
                    + " or to take arms against a sea of troubles,"
                    + " and by opposing end them?";

        // Extract words from the text
        String[] words = extractWords(text);

        // Sort the words using Bubble Sort
        bubbleSort(words);

        // Display the sorted words
        System.out.println("Sorted words in alphabetical order:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    /**
     * Definition of a word:
     * A "word" is defined as any sequence of contiguous alphabetic characters (a-z, A-Z).
     * The program removes all non-alphabetic characters (such as punctuation and numbers)
     * and treats words in a case-insensitive manner by converting everything to lowercase.
     * This means that "Hello" and "hello" are considered the same word for sorting purposes.
     */
    
    // Method to extract words from the text
    private static String[] extractWords(String text) {
        // Convert to lowercase and replace all non-alphabetical characters with a space
        text = text.toLowerCase().replaceAll("[^a-z]", " ");

        // Split the text by spaces to extract words
        String[] words = text.trim().split("\\s+");

        return words;
    }

    // Bubble Sort implementation
    private static void bubbleSort(String[] words) {
        int n = words.length;
        boolean swapped;

        // Repeat until no more swaps are needed
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                // Compare adjacent elements
                if (words[i].compareTo(words[i + 1]) > 0) {
                    // Swap if the first element is greater than the second
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    swapped = true;
                }
            }
            // Each iteration ensures the largest element is at the end
            n--;
        } while (swapped);
    }
}