package start.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @auther: Meruem117
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = {"/target", "test"})
    public String target() {
        return "target";
    }

    @RequestMapping(value = "/method", method = {RequestMethod.GET, RequestMethod.POST})
    public String method() {
        return "target";
    }

    @GetMapping("/get")
    public String get() {
        return "target";
    }

    @PostMapping("/post")
    public String post() {
        return "target";
    }

    @PutMapping("/put")
    public String put() {
        return "target";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "target";
    }

    @RequestMapping(value = "params", params = {"username", "password=123456"})
    public String params() {
        return "target";
    }

    @RequestMapping(value = "/headers", headers = {"!header", "Host=localhost:8080"})
    public String headers() {
        return "target";
    }

    @RequestMapping(value = "/a?t")
    // @RequestMapping(value = "/a*t")
    // @RequestMapping(value = "/**/ant")
    public String ant() {
        return "target";
    }

    @RequestMapping("/rest/{id}/{name}")
    public String rest(@PathVariable("id") String id, @PathVariable("name") String name) {
        System.out.println(id + name);
        return "target";
    }
}
