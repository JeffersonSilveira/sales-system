package io.github.jeffersonsilveira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendaApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendaApplication.class, args);
    }

    @GetMapping("hello")
    public String helloWord() {
        return "Hello Word teste";
    }
}
