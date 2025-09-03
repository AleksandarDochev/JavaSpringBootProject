package SandBox.StringAndObjectStringClassSignatures;

public class ClassStringSignature<S>{
    // A field to hold data of the generic type
    private int privateDataInt;
    private String privateDataString ="hassss";

    // Constructor to initialize the data
    public ClassStringSignature(int data) {
        this.privateDataInt = data;
    }
    public void logicVoidSomeClassGenericSignature(){
        System.out.println("this is logicVoid() method from ClassGenericSignature ");
        System.out.println("privateDataInt="+privateDataInt);
        System.out.println("privateDataString="+privateDataString);
    }

}
