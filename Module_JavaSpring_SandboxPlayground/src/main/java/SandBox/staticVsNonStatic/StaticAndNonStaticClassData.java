package SandBox.staticVsNonStatic;

public class StaticAndNonStaticClassData {

    //==================NON-Static Class Data and Methods
    public String DataString;
    public int DataInt;
    public void methodNonStatic(){
        System.out.println("methodNonStaticClass says: " +
                "DataInt: "+DataInt + " DataString: "+ DataString
                +" I can access both static and non-static data"
                +" staticDataInt: "+staticDataInt + " staticDataString: "+ staticDataString
        );
    }

    //==================Static Class Data and Methods

    //While possible to create public static variables, it is generally not recommended.
    //They should be used sparingly and with caution as any call of this class can modify the values
    public static String staticDataString ="SomeStringData";
    public static int staticDataInt=0;


    public static void methodStatic(){
        System.out.println("methodNonStaticClass says: " +
                "staticDataInt: "+staticDataInt + " staticDataString: "+ staticDataString
                +"I can access only these");
        staticDataInt+=10;
        staticDataString+="_AppendedInStaticMethod";
    }

}
