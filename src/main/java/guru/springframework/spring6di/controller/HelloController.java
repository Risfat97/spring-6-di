package guru.springframework.spring6di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String sayHello() {
        System.out.println("I'm in the controller " + HelloController.class);

        return "Hello everyone!";
    }
}
