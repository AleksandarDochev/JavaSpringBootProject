package SandBox.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Caller {

    ArrayStorage objJavaArray = new ArrayStorage();
    @Autowired
    private ArrayStorage arrayStorage;

    public void useArrayStorageFromSpringMethod() {
        System.out.println("--- Printing Arrays via @Autowired ---");
        for (String s : arrayStorage.Array1) {
            System.out.println(s);
        }
    }
    public void useArrayStorageFromJavaMethod(){
        System.out.println("--- Printing Arrays via regular Java ---");
        for (String s : objJavaArray.Array1) {
            System.out.println(s);
        }
    }
}
