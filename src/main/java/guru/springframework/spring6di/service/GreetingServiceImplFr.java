package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FR")
@Service("i18NService")
public class GreetingServiceImplFr implements GreetingService {
    @Override
    public String greeting(String name) {
        return "Bonjour " + name;
    }
}
