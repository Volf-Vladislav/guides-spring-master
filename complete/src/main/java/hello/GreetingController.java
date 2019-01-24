package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/contacts")
    public String contacts(@RequestParam(name = "contact", required = false, defaultValue = "George\n Phone number: +7123456789\n email: sample@example.com") String contact, Model model) {
        model.addAttribute("contact", contact);
        return "contacts";
    }

    @GetMapping("/about")
    public String about(@RequestParam(name = "content", required = false, defaultValue = "George\nPhone number: +7123456789\nemail: sample@example.com") String content, Model model) {
        model.addAttribute("content", content);
        return "about";
    }
}
