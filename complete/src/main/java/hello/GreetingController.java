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
    public String contacts(@RequestParam(name = "name", required = false, defaultValue = "sample text") String name,
                           @RequestParam(name = "phone", required = false, defaultValue = "sample text") String phone,
                           @RequestParam(name = "email", required = false, defaultValue = "sample text") String email,
                           Model model) {
        model.addAttribute("name", name);
        model.addAttribute("phone", phone);
        model.addAttribute("email", email);

        return "contacts";
    }

    @GetMapping("/about")
    public String about(@RequestParam(name = "content", required = false, defaultValue = "sample text") String content, Model model) {
        model.addAttribute("content", content);
        return "about";
    }
}
