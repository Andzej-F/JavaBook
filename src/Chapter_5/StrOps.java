package Chapter_5;

// Some Sring operations.
public class StrOps {
    public static void main(String[] args) {
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);// construct a string from another string
        String str3 = "Java strings are powerful.";
        String str4 = "Four";
        String str5 = "Five";
        String str6 = "Six";
        String str7 = str4 + str5 + str6;
        String str8 = "kuku";
        String str9 = str8;
        int result, idx;
        char ch;
        int array[] = new int[5];

        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of array: " + array.length);

        // display str1, one char at a time.
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }
        System.out.println();

        if (str1.equals(str2)) {
            System.out.println("str1 equals str2");
        } else {
            System.out.println("str1 does not equal str2");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 equals str3");
        } else {
            System.out.println("str1 does not equal str3");
        }

        System.out.println();

        result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("str1 and str3 are equal");
            System.out.println("result value: " + result);
        } else if (result < 0) {
            System.out.println("str1 is less than str3");
            System.out.println("result value: " + result);
        } else {
            System.out.println("str1 is greater than str3");
            System.out.println("result value: " + result);
        }

        System.out.println();

        // assign a new string to str2
        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Index of first occurence of One: " + idx);

        idx = str2.lastIndexOf("One");
        System.out.println("Index of last occurence of One: " + idx);

        System.out.println(str4 + str5 + str6);
        System.out.println(str7);

        result = str7.compareTo(str4 + str5 + str6);
        if (result == 0) {
            System.out.println("str7 and str4+str5+str6 are equal");
            System.out.println("result value: " + result);
        }

        if (str7.equals(str4 + str5 + str6)) {
            System.out.println("str7 equals str4+str5+str6");
        }

        if (str8 == str9) {
            System.out.println("str8 and str9 refer to the same object");
        }
    }
}
