package helloboot.toby;


import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
    public String hello(String name) {
        return "Hello " + name;
    }
}
