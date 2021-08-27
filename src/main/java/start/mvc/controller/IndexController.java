package start.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther: Meruem117
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/mapping")
    public String mapping() {
        return "mapping";
    }

    @RequestMapping("/param")
    public String param() {
        return "param";
    }
}
