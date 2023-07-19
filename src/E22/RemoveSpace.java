package E22;

public class RemoveSpace {
    private String myName;

    public RemoveSpace(){
        myName = "  Md. Akibuzzaman  ";
    }



    public String trim(){
        String myName;

        myName =  this.myName.trim();

        return myName;
    }
    public String replaceSpace(){
        String myName;

        myName =  this.myName.replace(" ","");

        return myName;
    }
}
