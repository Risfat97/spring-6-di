package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        HelloController helloCtrl = ctx.getBean(HelloController.class);

        System.out.println("I'm in the main");
        System.out.println(helloCtrl.sayHello());
    }

}
