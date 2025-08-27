package SandBox.memmorySizeReport;

public class MemoryReport {

    public void MemoryReportMethodStart(){
        // Step 1: Print memory usage before creating the object
        System.out.println("--- Memory before creating yourObject of choice ---");
        this.MemoryReportMethod();
    }
    public void MemoryReportMethod() {
        Runtime runtime = Runtime.getRuntime();

        // Calculate used, free, and total memory
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        // Convert bytes to megabytes for readability
        double usedMemoryMB = (double) usedMemory / (1024 * 1024);
        double freeMemoryMB = (double) freeMemory / (1024 * 1024);
        double totalMemoryMB = (double) totalMemory / (1024 * 1024);

        System.out.printf("Total Memory: %.2f MB%n", totalMemoryMB);
        System.out.printf("Free Memory: %.2f MB%n", freeMemoryMB);
        System.out.printf("Used Memory: %.2f MB%n", usedMemoryMB);
    }
    public void MemoryReportMethodAfter(){
        // Step 3: Print memory usage after creating the object
        System.out.println("\n--- Memory after creating yourObject of choice ---");
        this.MemoryReportMethod();
    }
    public void MemoryReportMethodAfterGC(){
        // Step 4: Print memory usage after garbage collection
        System.out.println("\n--- Memory after garbage collection ---");
        this.MemoryReportMethod();
    }
}
