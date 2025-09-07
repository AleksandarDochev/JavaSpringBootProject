package SandBox.staticVsNonStatic;

public class StaticVsNonStaticAndInstanceVsNonInstance {
    public static void main(String[] args) {

        System.out.println("\n=================NON Static Data and Methods =========================");
        //for non-static class we need to create an object of that class
        //only then we can access its methods
        StaticAndNonStaticClassData staticAndNonStaticClassData1 = new StaticAndNonStaticClassData();
        //the instance created above is used to call the method
        //I can't call the method directly like this if no instance is created
        staticAndNonStaticClassData1.DataString = "SomeStringData 1";
        staticAndNonStaticClassData1.DataInt = 25;

        //the non-static method can access both static and non-static data
        //non-static method can be instance specific so can be used more than once,
        // with different instance data as shown below
        staticAndNonStaticClassData1.methodNonStatic();

        StaticAndNonStaticClassData staticAndNonStaticClassData2 = new StaticAndNonStaticClassData();
        staticAndNonStaticClassData2.DataString = "SomeStringData 2";
        staticAndNonStaticClassData2.DataInt = 255;
        //here we call the same method but with different instance data
        staticAndNonStaticClassData2.methodNonStatic();

        System.out.println("staticAndNonStaticClassData1 instance1 data: "+ staticAndNonStaticClassData1.DataString + staticAndNonStaticClassData1.DataInt);
        System.out.println("staticAndNonStaticClassData2 instance2 data: "+ staticAndNonStaticClassData2.DataString + staticAndNonStaticClassData2.DataInt);

        System.out.println("\n================= Static Data and Methods =========================");
        //for static class we don't need to create an object of that class
        //we can access its methods directly using the class name and no object creation is needed
        //we can modify them directly using only the class name

        StaticAndNonStaticClassData.staticDataString ="SomeStringData Static 1";
        StaticAndNonStaticClassData.staticDataInt=100;
        System.out.println("StaticAndNonStaticClassData static data: "+ StaticAndNonStaticClassData.staticDataString + StaticAndNonStaticClassData.staticDataInt);

        //same for the static methods ,cane be access directly from the class name
        //no instance creation needed or allowed so ONLY ONE copy exists
        //and can be used anywhere
        //static methods can only access static data
        StaticAndNonStaticClassData.methodStatic();
        //calling it again to show that static data is same across all calls
        //so in the second call the data modified in the first call is retained
        StaticAndNonStaticClassData.methodStatic();

    }
}
