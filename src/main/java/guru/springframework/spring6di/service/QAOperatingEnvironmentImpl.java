package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("operatingEnvironmentService")
public class QAOperatingEnvironmentImpl implements OperatingEnvironment {
    @Override
    public String getEnv() {
        return "qa";
    }
}
