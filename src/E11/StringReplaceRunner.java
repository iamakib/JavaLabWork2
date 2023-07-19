package E11;

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
