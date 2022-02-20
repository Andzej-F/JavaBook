package Chapter_4;

public class ChkNum {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();
        if (e.isEven(10)) System.out.println("10 is even");
        if (e.isEven(9)) System.out.println("9 is even");
        if (e.isEven(8)) System.out.println("8 is even");
    }

    public boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }
}


