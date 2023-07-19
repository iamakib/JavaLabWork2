package E29;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder("desserts");
        System.out.println("String = " + stringBuilder.toString());

        String reverse = String.valueOf(stringBuilder.reverse());
        System.out.println("Reverse String = " + reverse);

    }
}
