package E22;

/* E2.2 Look into the API documentation of the String class and locate the trim method. Write a program demonstrating what it does. Then show how you can use the replace method to remove all spaces from a string. */
public class RemoveSpaceRunner {
    public static void main(String[] args) {
        RemoveSpace myString = new RemoveSpace();

        String trim = myString.trim();
        System.out.println(trim);

        String replace = myString.replaceSpace();
        System.out.println(replace);
    }
}
