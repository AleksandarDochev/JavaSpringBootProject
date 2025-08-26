package SandBox.Utils;

import org.springframework.stereotype.Component;

@Component
public class PrinterCustom {
    ListStorage objectForListStorage = new ListStorage();
    ArrayStorage objectForArrayStorage = new ArrayStorage();
    public void listPrint(){
        
            System.out.println("Contents of Array1:");
            for (String s : objectForListStorage.List1) {
                System.out.println(s);
            }

            System.out.println("\nContents of Array2:");
            for (String s : objectForListStorage.List2) {
                System.out.println(s);
            }

            System.out.println("\nContents of Array3:");
            for (String s : objectForListStorage.List3) {
                System.out.println(s);
            }
    }
    public void arrayPrint(){
        System.out.println("Contents of Array1:");
        for (String s : objectForArrayStorage.Array1) {
            System.out.println(s);
        }

        System.out.println("\nContents of Array2:");
        for (String s : objectForArrayStorage.Array2) {
            System.out.println(s);
        }

        System.out.println("\nContents of Array3:");
        for (String s : objectForArrayStorage.Array3) {
            System.out.println(s);
        }
    }
}
