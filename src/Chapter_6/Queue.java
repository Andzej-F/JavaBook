package Chapter_6;
/* An improved queue class for characters.*/

public class Queue {

    public char q[];// this array holds the queue
    public int putloc, getloc;// the put and get indices

    public Queue(int size) {
        q = new char[size];// allocate memory for queue
        putloc = getloc = 0;
    }

    // Construct a Queue from a Queue
    public Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // copy elements
        for (int i = getloc; i < putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    // Construct a Queue with initial values.
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // Get a character from the queue
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}


