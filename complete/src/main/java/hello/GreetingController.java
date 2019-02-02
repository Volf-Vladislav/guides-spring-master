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
    @GetMapping("/about")
        public String about(@RequestParam(name = "about", required = false, defaultValue = "some info ab me ;D") String about, Model model) {
        model.addAttribute("about", about);
        return "about";
    }
    @GetMapping("/contacts")
    public String contacts(@RequestParam(name = "mail"  , required = false, defaultValue = "arsenkadaev@mail.ru")String mail,
                           @RequestParam(name = "number"  , required = false, defaultValue = "+7(903)004-89-06")String number,
                           Model model){
        model.addAttribute("mail", mail);
        model.addAttribute("number", number);
        return "contacts";
    }
}
