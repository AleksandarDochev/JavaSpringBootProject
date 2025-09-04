package SandBox.VoidAndNonVoidMethods;

public class VoidAndNonVoidMethods {
    public void makeBreakfastVoid() {
        System.out.println("Made breakfast and ate it!");
    }
    public Breakfast makeBreakfastNonVoid() {
        Breakfast meal = new Breakfast("eggs and toast", " with a side of bacon", " and coffee");
        return meal; // handing it back
    }

}
