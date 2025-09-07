package SandBox.staticVsNonStatic;

public class main {
    public static void main(String[] args) {

        //for non-static class we need to create an object of that class
        //only then we can access its methods
        NonStaticClass nonStaticClass1 = new NonStaticClass();
        //the instance created above is used to call the method
        //I can't call the method directly like this if no instance is created

        nonStaticClass1.methodNonStaticClass();
        nonStaticClass1.tpmDataString = "SomeStringData ";
        nonStaticClass1.tmpDataInt = 25;
        System.out.println(nonStaticClass1.tpmDataString+nonStaticClass1.tmpDataInt);

        NonStaticClass nonStaticClassReference2 = new NonStaticClass();



    }
}
