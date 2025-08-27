package SandBox.memmorySizeReport;

import SandBox.ModuleJavaSpringSandboxPlaygroundApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class MemoryUsageEstimator {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ModuleJavaSpringSandboxPlaygroundApplication.class, args);
        // Create an instance of the class to call the method
        MemoryReport estimator = new MemoryReport();
        // Step 1: Print memory usage before creating the object
        estimator.MemoryReportMethodStart();
        // Step 2: Create the object you're interested in
        SomeClassWithData someClassWithData = new SomeClassWithData();
        // Step 3: Print memory usage after creating the object
        estimator.MemoryReportMethodAfter();
        // The object is now out of scope and can be garbage collected
        someClassWithData = null;
        // Hint to the garbage collector to run
        System.gc();
        // Step 4: Print memory usage after garbage collection
        estimator.MemoryReportMethodAfterGC();
    }

}