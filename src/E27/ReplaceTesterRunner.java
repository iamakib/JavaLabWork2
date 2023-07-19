package E27;

public class ReplaceTesterRunner {
    public static void main(String[] args) {
        ReplaceTester replaceTester = new ReplaceTester();

        System.out.println("Original string : ");
        System.out.println(replaceTester.returnString());

        String firstString = replaceTester.ReplaceI();
        replaceTester.UpdateString(firstString);
        String secondString = replaceTester.ReplaceS();

        System.out.println("Output : ");
        System.out.println(secondString);
    }
}
