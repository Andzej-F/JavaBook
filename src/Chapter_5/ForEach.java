package Chapter_5;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
//        int i;

//        for (int i = 0; i < 10; i++) {
//            sum += nums[i];
//        }

        for (int x : nums) {
            sum += x;
            System.out.println("Value is " + x);
        }
        System.out.println("Sum is " + sum);
        sum = 0;

        // Sum only the first 5 elements
        for (int x : nums) {
            System.out.println("x value is " + x);
            sum += x;

            if (x == 5) {
                break;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
