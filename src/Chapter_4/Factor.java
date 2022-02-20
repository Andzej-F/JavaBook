package Chapter_4;

public class Factor {
    public static void main(String[] args) {
        Factor x = new Factor();

        if (x.isFactor(2, 20)) System.out.println("2 is factor");
        if (x.isFactor(3, 20)) System.out.println("3 is factor");
    }

    public boolean isFactor(int nbr1, int nbr2) {
        return (nbr2 % nbr1 == 0) ? true : false;
    }
}
