package E21;

public class StringReplace {
    private String stateName;

    public StringReplace(){
        stateName = "Mississippi";
    }
    public void replaceString(String stateName){
        this.stateName = stateName;
    }

    public String replaceI(){
        String newStateName;

        newStateName = stateName.replace("i","ii");

        return newStateName;
    }

    public String replaceSS(){
        String newStateName;

        newStateName = stateName.replace("ss","s");

        return newStateName;
    }

    public int calculateLength(String name){
        return name.length();
    }

}
