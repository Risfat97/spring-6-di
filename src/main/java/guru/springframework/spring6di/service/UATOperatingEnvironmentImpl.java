package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("operatingEnvironmentService")
public class UATOperatingEnvironmentImpl implements OperatingEnvironment {
    @Override
    public String getEnv() {
        return "uat";
    }
}
