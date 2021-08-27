package start.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @auther: Meruem117
 */
@Controller
@RequestMapping("/scope")
public class ScopeController {
    @RequestMapping("/servlet")
    public String servlet(HttpServletRequest request) {
        request.setAttribute("msg", "hello");
        return "target";
    }
}
