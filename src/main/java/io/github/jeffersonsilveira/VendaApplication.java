package io.github.jeffersonsilveira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(
        basePackages = {
            "io.github.jeffersonsilveira.repository",
            "io.github.jeffersonsilveira.service",
            "com.umaoutrabiblioteca.projeto"
        }
)
@RestController
public class VendaApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendaApplication.class, args);
    }

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @GetMapping("hello")
    public String helloWord() {
        return applicationName;
    }
}