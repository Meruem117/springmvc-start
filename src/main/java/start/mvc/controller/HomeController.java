package start.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther: Meruem117
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
