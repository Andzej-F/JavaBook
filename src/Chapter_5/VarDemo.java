package Chapter_5;

public class VarDemo {
    public static void main(String[] args) {
        /* Remember that var can be used only to declare local variables.
        It cannot be used when declaring instance variables, parameters,
        or return types, for example*/

        var avg = 10.0;
        var number = 16;
        var name = "Stephen";
        int var = 1;
        var k = -var;
        var myArray = new int[10];
        var counter = 0;

        System.out.println("Value of avg: " + avg);
        System.out.println("Value of number: " + number);
        System.out.println("Value of name: " + name);
        System.out.println("Value of var: " + var);
        System.out.println("Value of k: " + k);


        var myStr = "This is a string";
        var mySubStr = myStr.substring(5, 10);
    }
}
