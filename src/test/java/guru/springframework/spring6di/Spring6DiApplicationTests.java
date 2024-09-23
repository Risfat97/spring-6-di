package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {
    @Autowired
    private ApplicationContext ctx;

    @Autowired
    private HelloController helloController;

    @Test
    public void testGettingControllerFromContext() {
        HelloController helloCtrl = ctx.getBean(HelloController.class);

        System.out.println(helloCtrl.sayHello());
    }

    @Test
    public void testAutowiredController() {
        System.out.println(helloController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
