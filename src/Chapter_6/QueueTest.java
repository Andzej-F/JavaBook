package Chapter_6;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(10);

        queue.put(8);
        queue.put(12);
        System.out.println(queue.get());
    }
}
