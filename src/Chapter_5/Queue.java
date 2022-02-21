package Chapter_5;

/* A queue class for characters.*/
public class Queue {
    char q[];// this array holds the queue
    int putloc, getloc;// the put and get indices

    public Queue(int size) {
        this.q = new char[size];
        putloc = getloc = 0;
    }
}
