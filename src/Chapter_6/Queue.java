package Chapter_6;
/* An improved queue class for characters.*/

public class Queue {

    private int numbersArray[];// this array holds the queue
    private int putloc, getloc;// the put and get indices

    public Queue(int size) {
        this.numbersArray = new int[size];// allocate memory for queue
        this.putloc = this.getloc = 0;
    }

    // put an integer into the queue
    public void put(int number) {

        if (this.putloc == numbersArray.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        numbersArray[this.putloc++] = number;
    }

    // get an integer from the queue
    public int get() {

        if (this.getloc == this.putloc) {
            System.out.println(" - Queue is empty.");
            return -1;
        }

        return numbersArray[this.getloc++];
    }
}

