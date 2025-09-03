package SandBox.StringAndObjectStringClassSignatures;

public class ClassGenericSignature<T> {

    // A field to hold data of the generic type
    private int privateDataInt;
    private String privateDataString;

    // Constructor to initialize the data
    public ClassGenericSignature(int data) {
        this.privateDataInt = data;
    }
    public void logicVoidSomeClassGenericSignature(){
        System.out.println("this is logicVoid() method from ClassGenericSignature ");
        System.out.println("privateDataInt="+privateDataInt);
        System.out.println("privateDataString="+privateDataString);
    }
}
