package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("operatingEnvironmentService")
public class DevOperatingEnvironmentImpl implements OperatingEnvironment {
    @Override
    public String getEnv() {
        return "dev";
    }
}
