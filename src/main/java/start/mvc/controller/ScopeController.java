package start.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @auther: Meruem117
 */
@Controller
@RequestMapping("/scope")
public class ScopeController {
    @RequestMapping("/servlet")
    public String servlet(HttpServletRequest request) {
        request.setAttribute("msg", "hello from Servlet");
        return "target";
    }

    @RequestMapping("/mav")
    public ModelAndView mav() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "hello from ModelAndView");
        mav.setViewName("target");
        return mav;
    }

    @RequestMapping("/model")
    public String model(Model model) {
        model.addAttribute("msg", "hello from Model");
        return "target";
    }

    @RequestMapping("/map")
    public String map(Map<String, Object> map) {
        map.put("msg", "hello from Map");
        return "target";
    }

    @RequestMapping("/mm")
    public String mm(ModelMap modelMap) {
        modelMap.addAttribute("msg", "hello from ModelMap");
        return "target";
    }
}
