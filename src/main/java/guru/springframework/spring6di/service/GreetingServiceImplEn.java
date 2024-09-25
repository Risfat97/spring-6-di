package guru.springframework.spring6di.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplEn implements GreetingService {
    @Override
    public String greeting(String name) {
        return "Hello " + name;
    }
}
