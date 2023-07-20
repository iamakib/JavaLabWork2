/* E2.1 Write a program that initialises a string with "Mississippi". Then replace all "i" with "ii" and print the length of the resulting string. In that string, replace all "ss" with "s" and print the length of the resulting string. */

package E21;

public class StringReplaceRunner {
    public static void main(String[] args) {

        StringReplace myString = new StringReplace();

        String firstChange = myString.replaceI();
        myString.replaceString(firstChange);
        String secondChange = myString.replaceSS();

        System.out.println(firstChange);
        System.out.println(myString.calculateLength(firstChange));

        System.out.println(secondChange);
        System.out.println(myString.calculateLength(secondChange));
    }
}
