package SandBox.Utils;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SimpleListClassEmptyReferenceVsActualObject {


    /**
     * The primary difference between public List<String> List1; and List<String> List2 = new ArrayList<>(); is initialization.
     * public List<String> List1;
     * This line declares the variable List1. It tells the compiler that List1 will hold a List of String objects.
     * At this point, List1 has a value of null. It's just an empty reference, pointing to nothing in memory. You cannot add elements to it or call any methods on it until it is initialized with an actual object (e.g., new ArrayList<>()).
     * List<String> List2 = new ArrayList<>();
     * This line initializes the variable List2. It does two things:
     * It declares the variable List2 (similar to the first example).
     * It creates a new, concrete ArrayList object in memory and assigns its reference to List2.
     * Because List2 is an actual object, you can immediately start adding elements to it, for example, List2.add("hello");.
     * In short, List1 is a null reference that needs an object, while List2 is a fully initialized object that is ready to be used.
    */
    public List<String> List1emptyReference;
    public List<String> List2actualObject = new ArrayList<>();
    public SimpleListClassEmptyReferenceVsActualObject() {

        //this will give an error as it's not yet initialized
//        List1.add("HelloAdd");
//        List1.add("WorldAdd");
//        List1.add("SimpleListAdd");
        this.List1emptyReference = Arrays.asList("HelloThis", "WorldThis", "SimpleListThis");

        List2actualObject.add("Hello");
        List2actualObject.add("World");
        List2actualObject.add("SimpleList");
    }

}
