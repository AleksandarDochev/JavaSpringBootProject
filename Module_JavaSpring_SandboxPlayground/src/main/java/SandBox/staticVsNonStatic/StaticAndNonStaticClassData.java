package SandBox.staticVsNonStatic;

public class StaticAndNonStaticClassData {

    //==================NON-Static Class Data
    public String DataString;
    public int DataInt;
    public void methodNonStaticClass(){
        System.out.println("methodNonStaticClass called");
    }

    //==================Static Class Data

    //While possible to create public static variables, it is generally not recommended.
    //They should be used sparingly and with caution as any call of this class can modify the values
    public static String staticDataString ="SomeStringData";
    public static int staticDataInt=0;
    public void methodStaticClass(){
        System.out.println("methodStaticClass called");
        System.out.println("tpmDataString: "+ staticDataString);
        System.out.println("tmpDataInt: "+ staticDataInt);
    }
}
