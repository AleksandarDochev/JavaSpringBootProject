package SandBox.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    //here we create an endpoint and assign what it should return to the user
    //after http://localhost:6055/dashboard is how it's
    @GetMapping("/dashboard")
    public String showDashboard() {
        // This will tell Spring to look for a template named 'index'
        // which corresponds to src/main/resources/static/index.html
        return "index.html";
    }

    public String startCoding() {
        // Here you can add logic that you want to execute when the button is clicked.
        // For example, starting a new process, logging an event, or redirecting to another page.
        System.out.println("The 'Start coding well' button was clicked!");

        // Return the name of the view (e.g., HTML page) to display after the click.
        // In this case, we'll redirect back to the home page or a success page.
        return "redirect:/";
    }
    @GetMapping("/start-coding")
    @PostMapping("/start-coding")
    public void startCodingMethod(){
        System.out.println("The 'Start coding well' button was clicked! and method was successfully mapped");
    }
}
