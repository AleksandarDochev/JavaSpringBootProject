package SandBox.StringAndObjectStringClassSignatures;

//1. Reference Types
// Examples:
//SomeClass<String> myStringObject;
//SomeClass<Integer> myIntegerObject;
//SomeClass<SomeOtherClass> myCustomObject;
//SomeClass<ArrayList<String>> myNestedGenericObject;
//SomeClass<Runnable> myInterfaceObject;

//2. Wildcard Types
// Examples:
//SomeClass<?> myUnknownTypeObject; // Represents any type
//SomeClass<? extends Number> myBoundedTypeObject; // Represents Number or any of its subclasses (e.g., Integer, Double)
//SomeClass<? super Integer> myLowerBoundedTypeObject; // Represents Integer or any of its superclasses (e.g., Number, Object)
public class ClassSignatureTypes {

    private Integer heh;
    public Integer forcedIntegerByClassSignature(){
        this.heh =12;
        return heh;
    }
}
