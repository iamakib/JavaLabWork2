package E28;

public class HolleoPrinterRunner {
    public static void main(String[] args) {
        HollePrinter string = new HollePrinter();

        String firstChange = string.replaceOo();
        string.updateString(firstChange);

        String secondChange = string.replaceEO();
        string.updateString(secondChange);

        String thirdChange = string.replaceOE();

        System.out.println(thirdChange);
    }
}
