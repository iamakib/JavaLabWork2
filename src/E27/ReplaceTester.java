package E27;

public class ReplaceTester {
    private String string;

    public ReplaceTester(){
        string = "Mississippi";
    }

    public String returnString(){
        return this.string;
    }
    public void UpdateString(String name){
        this.string = name;
    }
    public String ReplaceI(){
        String newString;
        newString = this.string.replace("i","!");
        return newString;
    }
    public String ReplaceS(){
        String newString;
        newString = this.string.replace("s","$");
        return newString;
    }
}
