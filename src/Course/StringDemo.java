package Course;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==== String methods ====");
        System.out.println();

        String s = " hello ";
        System.out.println("s.length(): " + s.length());
        System.out.println("s.contains(\"he\"): " + s.contains("he"));
        System.out.println("s.isEmpty: " + s.isEmpty());
        System.out.println("s.toUpperCase(): " + s.toUpperCase());
        System.out.println("s.startsWith(\"h\"): " + s.startsWith("h"));
        System.out.println("s.endsWith(\" \"): " + s.endsWith(" "));
        System.out.println("s.replace(\"ll\",\"LL\"): " + s.replace("ll", "LL"));
        System.out.println("s.trim(): " + s.trim());
        System.out.println("s.strip(): " + s.strip());
        System.out.println("s.substring(0,3): " + s.substring(2, 3));
        System.out.println("Arrays.toString(s.getBytes()):" +
                Arrays.toString(s.getBytes()));
        System.out.println("Arrays.toString(s.toCharArray()):" +
                Arrays.toString(s.toCharArray()));
        System.out.println("s.charAt(1): " + s.charAt(1));
        System.out.println("Arrays.toString(s.split(\"e\")): "
                + Arrays.toString(s.split("e")));
        // String is immutable
        System.out.println(s);
        System.out.println();

        System.out.println("==== String comparison =====");
        System.out.println();

        // When we are using the string literal in the program, the string
        // is added to a pool of strings. Next time use are using the same
        // string literal, Java checks whether such string already exists in
        // a string pool. If yes, then Java returns reference to the object
        // that is already in the heap memory, instead of creating a new one.
        String s2 = " hello ";
        System.out.println("s == s2 " + (s == s2));// true

        // On the other hand, when you are using 'new' keyword-you say Java
        // to allocate memory and create new object in heap. Taking into account
        // we used string literal when initialised 's' and 's2' variables -
        // these two variables are referring to the same object in the pool of strings.
        String s3 = new String(" hello ");
        System.out.println("s == s3 " + (s == s3));// false
        System.out.println("s.equals(s3): " + (s.equals(s3)));// true

        // Thanks to the immutability of Strings in Java, the JVM can optimize
        // the amount of memory allocated for them by storing only one copy of
        // each literal String in the pool. This process is called interning.
        System.out.println("s == s3.intern(): " + (s == s3.intern()));// true

        String firstName = "Andrii";
        String firstName2 = "andrii";
        System.out.println("firstName.equals(firstName2): " + firstName.equals(firstName2));
        System.out.println("firstName.equalsIgnoreCase(firstName2): " + firstName.equalsIgnoreCase(firstName2));
    }
}
