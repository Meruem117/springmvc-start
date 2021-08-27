package start.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @auther: Meruem117
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/servlet")
    public String servlet(HttpServletRequest request) {
        String username = request.getParameter("username");
        System.out.println(username);
        return "target";
    }

    @RequestMapping("/param")
    public String param(String username) {
        System.out.println(username);
        return "target";
    }

    @RequestMapping("/params")
    public String params(String[] names) {
        System.out.println(Arrays.toString(names));
        return "target";
    }

    @RequestMapping("/requestParam")
    public String requestParam(@RequestParam(value = "user", required = false, defaultValue = "name") String username) {
        System.out.println(username);
        return "target";
    }
}
