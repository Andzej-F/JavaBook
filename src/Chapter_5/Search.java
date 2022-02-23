package Chapter_5;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        int sum, average, minValue, maxValue, count;
        sum = average = count = 0;
        int duplicates[] = new int[nums.length];
        boolean found = false;

        // Use for-each style for to search nums for val.
//        for (int x : nums) {
//            if (x == val) {
//                System.out.println("Value " + val + " found= the x value is " + x);
//                found = true;
//                break;
//            }
//        }
//
//        if (found) {
//            System.out.println("Value " + val + " found");
//        }

//         - computing an average
        minValue = maxValue = nums[0];
        for (int x : nums) {
            if (maxValue > x) {
                maxValue = x;
            } else if (minValue < x) {
                minValue = x;
            }

            sum += x;
            count++;
        }

        average = sum / count;

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
        System.out.println("Minimum value is " + minValue);
        System.out.println("Maximum value is " + maxValue);
    }
}
/*Other types of applications that benefit from for-each style loops include:
 - computing an average,
 - finding the minimum of a set
 - finding the maximum of a set,
 - looking for duplicates */