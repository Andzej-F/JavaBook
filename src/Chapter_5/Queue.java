package Chapter_5;

/* A queue class for characters.*/
public class Queue {
    char q[];// this array holds the queue
    int putloc, getloc;// the put and get indices

    public Queue(int size) {
        this.q = new char[size];// allocate memory for queue
        this.putloc = this.getloc = 0;
    }

    // out a character into the queue
    public void put(char ch) {
        if (this.putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[this.putloc++] = ch;
    }

    // get a character from the queue
    public char get() {
        if (this.getloc == this.putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[this.getloc++];
    }
}
