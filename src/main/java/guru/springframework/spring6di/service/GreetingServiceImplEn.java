package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class GreetingServiceImplEn implements GreetingService {
    @Override
    public String greeting(String name) {
        return "Hello " + name;
    }
}
