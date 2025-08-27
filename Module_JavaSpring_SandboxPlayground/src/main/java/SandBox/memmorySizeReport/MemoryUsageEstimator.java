package SandBox.memmorySizeReport;

public class MemoryUsageEstimator {

    public static void main(String[] args) {
        // Create an instance of the class to call the method
        MemoryReport estimator = new MemoryReport();

        // Step 1: Print memory usage before creating the object
        System.out.println("--- Memory before creating yourObject of choice ---");
        estimator.MemoryReportMethod();

        // Step 2: Create the object you're interested in
        PrinterCustom myPrinterJava = new PrinterCustom();

        // Step 3: Print memory usage after creating the object
        System.out.println("\n--- Memory after creating yourObject of choice ---");
        estimator.MemoryReportMethod();

        // The object is now out of scope and can be garbage collected
        myPrinterJava = null;

        // Hint to the garbage collector to run
        System.gc();

        // Step 4: Print memory usage after garbage collection
        System.out.println("\n--- Memory after garbage collection ---");
        estimator.MemoryReportMethod();
    }

    /**
     * Prints a report of the current memory usage of the JVM.
     */

}

// Dummy class to make the example compilable
class PrinterCustom {}