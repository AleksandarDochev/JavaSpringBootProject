package SandBox.Utils;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class ListStorage {
    public List<String> List1;
    public List<String> List2;
    public List<String> List3;

    public ListStorage() {
        // Initializes Array1 using the Arrays.asList() utility method.
        this.List1 = Arrays.asList("Hello", "World", "Java");
        // Initializes Array2 using the Arrays.asList() utility method.
        this.List2 = Arrays.asList("First", "Second", "Third");
        // Initializes Array3 using the Arrays.asList() utility method.
        this.List3 = Arrays.asList("Apple", "Banana", "Cherry");
    }
}
