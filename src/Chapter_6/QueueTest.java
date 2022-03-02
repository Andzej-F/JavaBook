package Chapter_6;

public class QueueTest {
    public static void main(String[] args) {
        // Construct 10-element empty queue
        Queue q1 = new Queue(10);

        char name[] = {'T', 'o', 'm'};
        // construct queue from array
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // put some characters into q1
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // Construct queue from another queue
        Queue q3 = new Queue(q1);

        // Show the queues.
        System.out.print("Contents of q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();

            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("q2.putloc= " + q2.putloc);
        System.out.println("q2.getloc= " + q2.getloc);

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
