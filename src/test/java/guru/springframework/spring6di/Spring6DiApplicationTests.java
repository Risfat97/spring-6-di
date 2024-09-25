package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.OperatingEnvironmentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring6DiApplicationTests {
    @Autowired
    private OperatingEnvironmentController operatingEnvironmentController;

    @Test
    public void testDefaultConfiguration() {
        assert operatingEnvironmentController.getEnv().equals("dev");
    }

    @Test
    void contextLoads() {
    }

}
