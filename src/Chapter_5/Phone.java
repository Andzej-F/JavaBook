package Chapter_5;

public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"Jon", "555-1037"},
                {"Rachel", "555-1400"}
        };
        int i;

        System.out.println(args.length);

        if (args.length != 1) {
            System.out.println("Usage: java Phone.java <name>");
        } else {
//            for (i = 0; i < 4; 0++) {
            for (i = 0; i < numbers.length; i++) {

//                if (numbers[0][0].equals(args[0])) {
//                if ("Tom".equals("Tom")) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length) {
                System.out.println("Name not found.");
            }
        }
    }
}
