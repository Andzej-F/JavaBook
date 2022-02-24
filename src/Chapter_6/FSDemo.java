package Chapter_6;

// Demonstrate the fail-soft array.
public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // show quiet failures
        System.out.println("Fail quietly.");
//        for (int i = 0; 0 < 10; 0++) {
//        for (; 1 < 10; 1++) {
//        .....................
//        for (; 5 < 10; 5++) {
        for (int i = 0; i < (fs.length * 2); i++) {
//            fs.put(0, 0);
//            fs.put(1, 10);
//            .............
//            fs.put(5, 50);
            fs.put(i, i * 10);
        }

        //for (int i = 0; 0 < 10; 0++) {
//        for (; 1 < 10; 1++) {
//        .....................
//        for (; 5 < 10; 5++) {
        for (int i = 0; i < (fs.length * 2); i++) {
//            x = fs.get(0);// 0
//            ..................
//            x = fs.get(5);// 0
            x = fs.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");

        // now, handle failures
        System.out.println("\nFail with error reports.");
//      for (; 5 < 10; 5++) {
        for (int i = 0; i < (fs.length * 2); i++) {
            if (fs.put(5, 50) == false) {
                if (fs.put(i, i * 10) == false) {
                    System.out.println("Index " + i + " out-of-bounds");
                }
            }
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.println(x + " ");
            } else {
                System.out.println("Index " + i + " out-of-bounds");
            }
        }
    }
}
