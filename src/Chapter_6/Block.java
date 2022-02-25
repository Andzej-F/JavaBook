package Chapter_6;

public class Block {
    public int a, b, c;
    public int volume;

    public Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Return true if ob defines samw block.
    public boolean sameBlock(Block ob) {
        if ((ob.a == a) && (ob.b == b) && (ob.c == c)) {
            return true;
        } else {
            return false;
        }
    }

    // Return true if ob has same volume.
    public boolean sameVolume(Block ob) {
        if (ob.volume == volume) {
            return true;
        } else {
            return false;
        }
    }
}

