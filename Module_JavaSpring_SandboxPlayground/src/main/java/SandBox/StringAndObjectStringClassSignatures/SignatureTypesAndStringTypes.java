package SandBox.StringAndObjectStringClassSignatures;

public class SignatureTypesAndStringTypes {

//    The key difference between public String stringMethod() and public SpecialString<String> stringSpecialStringMethod() lies in their return types.
//    public String stringMethod()
//    This is a method that returns a standard String object. This is a common and straightforward method declaration.
//    Return Type: String
//    Purpose: The method is designed to perform some operation and then return a single String value.
//    Example: It might return a user's name, a filename, or a simple message.
    public String stringMethod(){
        return "hello from simple stringMethod";
    }

    //This method returns an object of a generic class named SpecialString
    public ClassGenericSignature<String> someGenericClassMethodString(){
        System.out.println("someGenericClassMethod called");
        return new ClassGenericSignature<>(12);
    }
    public ClassStringSignature<String> someStringClassMethod(){
        System.out.println("someStringClassMethod called");
        return new ClassStringSignature<>(12);
    }

}
