package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("operatingEnvironmentService")
public class ProdOperatingEnvironmentImpl implements OperatingEnvironment {
    @Override
    public String getEnv() {
        return "prod";
    }
}
