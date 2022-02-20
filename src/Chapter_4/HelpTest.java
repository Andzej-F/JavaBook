package Chapter_4;

import Chapter_3.Help;

public class HelpTest {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;

        Help4 hlpobj = new Help4();

        for (; ; ) {
            do {
                hlpobj.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!hlpobj.isValid(choice));

            if (choice == 'q') {
                break;
            }
            System.out.println("\n");
            hlpobj.helpOn(choice);
        }
    }
}
