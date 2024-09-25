package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("FR")
@SpringBootTest
class Spring6DiApplicationTests {
    @Autowired
    private HelloController helloController;

    @Test
    public void testAutowiredController() {
        System.out.println(helloController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
