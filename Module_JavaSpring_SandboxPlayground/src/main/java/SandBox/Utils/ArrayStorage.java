package SandBox.Utils;

import org.springframework.stereotype.Component;

@Component
public class ArrayStorage {
    public int callCountArrayStorage = 0;
    public String[] Array1;
    public String[] Array2;
    public String[] Array3;

    public ArrayStorage() {
        this.callCountArrayStorage++;
        System.out.println("Spring hello ArrayStorage");
        this.Array1 = new String[]{"Hello", "World", "Java"};
        this.Array2 = new String[]{"First", "Second", "Third"};
        this.Array3 = new String[]{"Apple", "Banana", "Cherry"};
    }

}
