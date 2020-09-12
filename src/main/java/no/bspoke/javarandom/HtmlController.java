package no.bspoke.javarandom;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    @GetMapping("/")
    String homepage(Model model)  {
        model.addAttribute("title", "Generate Random Numbers by Java API");
        return "homepage";
    }
}
