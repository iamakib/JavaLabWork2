package E28;

public class HollePrinter {
    private String string ;

    public HollePrinter(){
        string = "Hello, World!";
    }

    public void updateString(String name){
        this.string = name;
    }
    public String replaceOo(){
        String newString;
        newString = this.string.replace("o","O");

        return newString;
    }
    public String replaceEO(){
        String newString;
        newString = this.string.replace("e","o");

        return newString;
    }
    public String replaceOE(){
        String newString;
        newString = this.string.replace("O","e");

        return newString;
    }
}
