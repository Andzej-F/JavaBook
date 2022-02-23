package Chapter_5;

public class VarDemo3 {
    public static void main(String[] args) {

        // Use type inference with the loop control variable
        System.out.print("Values of x: ");
        for (var x = 2.5; x < 100.00; x *= 2) {
            System.out.print(x + " ");
        }
        System.out.println("\n");

        // Use type inference with the iteration variable.
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Values in nums array: ");
        for (var v : nums) {
            System.out.print(v + " ");
        }
        System.out.println();

        var dudu = 25;
        var kudu = 25 + 15;
        var myArray = new int[10];

    }
}
