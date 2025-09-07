package SandBox.staticVsNonStatic;

public class StaticVsNonStaticAndInstanceVsNonInstance {
    public static void main(String[] args) {

        //=================NON Static Class =========================

        //for non-static class we need to create an object of that class
        //only then we can access its methods
        StaticAndNonStaticClassData staticAndNonStaticClassData1 = new StaticAndNonStaticClassData();
        //the instance created above is used to call the method
        //I can't call the method directly like this if no instance is created
        staticAndNonStaticClassData1.methodNonStaticClass();
        staticAndNonStaticClassData1.DataString = "SomeStringData 1";
        staticAndNonStaticClassData1.DataInt = 25;

        StaticAndNonStaticClassData staticAndNonStaticClassData2 = new StaticAndNonStaticClassData();
        staticAndNonStaticClassData2.methodNonStaticClass();
        staticAndNonStaticClassData2.DataString = "SomeStringData 2";
        staticAndNonStaticClassData2.DataInt = 255;

        System.out.println("staticAndNonStaticClassData1 instance1 data: "+ staticAndNonStaticClassData1.DataString + staticAndNonStaticClassData1.DataInt);
        System.out.println("staticAndNonStaticClassData2 instance2 data: "+ staticAndNonStaticClassData2.DataString + staticAndNonStaticClassData2.DataInt);

        //=================Static Class ============================
        //for static class we don't need to create an object of that class
        //we can access its methods directly using the class name and no object creation is needed
        //we can modify them directly using only the class name

        StaticAndNonStaticClassData.staticDataString ="SomeStringData Static 1";
        StaticAndNonStaticClassData.staticDataInt=100;
        System.out.println("StaticAndNonStaticClassData static data: "+ StaticAndNonStaticClassData.staticDataString + StaticAndNonStaticClassData.staticDataInt);


    }
}
