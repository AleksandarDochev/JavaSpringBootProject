package SandBox.memmorySizeReport;

public class MemoryUsageEstimator {

    public static void main(String[] args) {
        // Create an instance of the class to call the method
        MemoryReport estimator = new MemoryReport();
        // Step 1: Print memory usage before creating the object
        estimator.MemoryReportMethodStart();
        // Step 2: Create the object you're interested in
        PrinterCustom myPrinterJava = new PrinterCustom();
        // Step 3: Print memory usage after creating the object
        estimator.MemoryReportMethodAfter();
        // The object is now out of scope and can be garbage collected
        myPrinterJava = null;
        // Hint to the garbage collector to run
        System.gc();
        // Step 4: Print memory usage after garbage collection
        estimator.MemoryReportMethodAfterGC();
    }

}
// Dummy class to make the example compilable
class PrinterCustom {}