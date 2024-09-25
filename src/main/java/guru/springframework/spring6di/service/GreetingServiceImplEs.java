package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class GreetingServiceImplEs implements GreetingService {
    @Override
    public String greeting(String name) {
        return "Hola " + name;
    }
}
