package Chapter_5;

/*4. Change the sort in Try This 5-1 so that it sorts an array of strings. Demonstrate that
it works.*/
public class Ex_5_1_SortString {

    public static void main(String[] args) {
        String words[] = {"this", "is", "a", "test", "of", "a", "string", "sort"};
        int a, b;
        String t;
        int size = words.length;


        // display original array
        System.out.println("Original array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + words[i]);
        }
        System.out.println();

        // This is the Bubble sort.
        for (a = 1; a < size; a++) {

            for (b = size - 1; b >= a; b--) {
                if (words[b - 1].compareTo(words[b]) > 0) {
//                if (words[b - 1].length() > words[b].length()) {
                    // exchange elements
                    t = words[b - 1];
                    words[b - 1] = words[b];
                    words[b] = t;
                }
            }
        }

        // display sorted array
        System.out.println("Sorted array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + words[i]);
        }
        System.out.println();
    }
}
