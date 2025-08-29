package SandBox.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyWebController {

    @GetMapping("/dashboard")
    public String showDashboard() {
        // This will tell Spring to look for a template named 'index'
        // which corresponds to src/main/resources/static/index.html
        return "index.html";
    }
    @GetMapping("/start-coding")
    public String startCoding() {
        // Here you can add logic that you want to execute when the button is clicked.
        // For example, starting a new process, logging an event, or redirecting to another page.
        System.out.println("The 'Start coding well' button was clicked!");

        // Return the name of the view (e.g., HTML page) to display after the click.
        // In this case, we'll redirect back to the home page or a success page.
        return "redirect:/";
    }
}
