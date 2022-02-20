package Chapter_4;

public class PwrTest {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);
        

        System.out.println(x.base + " raised to the " + x.exp + " power is " + x.get_pwr());
        System.out.println(y.base + " raised to the " + y.exp + " power is " + y.get_pwr());
        System.out.println(z.base + " raised to the " + z.exp + " power is " + z.get_pwr());
    }
}
