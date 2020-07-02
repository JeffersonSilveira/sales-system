package io.github.jeffersonsilveira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendaApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendaApplication.class, args);
    }
    @Value("${application.name}")
    private String applicationName;

    @GetMapping("hello")
    public String helloWord() {
        return applicationName;
    }
}