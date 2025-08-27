package SandBox.memmorySizeReport;

public class MemoryReport {

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
}
