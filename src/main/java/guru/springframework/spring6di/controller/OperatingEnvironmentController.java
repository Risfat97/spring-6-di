package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.OperatingEnvironment;
import org.springframework.stereotype.Controller;

@Controller
public class OperatingEnvironmentController {
    private final OperatingEnvironment operatingEnvironment;

    public OperatingEnvironmentController(OperatingEnvironment operatingEnvironment) {
        this.operatingEnvironment = operatingEnvironment;
    }

    public String getEnv() {
        return operatingEnvironment.getEnv();
    }
}
