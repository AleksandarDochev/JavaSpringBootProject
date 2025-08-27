package SandBox.memmorySizeReport;

import java.util.ArrayList;
import java.util.List;

public class SomeClassWithData {
    //Here you can comment the different classes to see how your application changes it's allocated memory
    private final byte[] largeArray1 = new byte[10 * 1024 * 1024]; // 10 MB
    private final byte[] largeArray2 = new byte[10 * 1024 * 1024* 10]; // 100 MB
    private final byte[] largeArray3 = new byte[10 * 1024 * 1024* 10]; // 100 MB
    private final byte[] largeArray4 = new byte[10 * 1024 * 1024* 10]; // 100 MB
}
