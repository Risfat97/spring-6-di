package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
    private final GreetingService greetingService;

    public HelloController(@Qualifier("greetingServiceImplFr") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I'm in the controller " + HelloController.class);

        return greetingService.greeting("John Doe");
    }
}
