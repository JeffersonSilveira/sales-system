package io.github.jeffersonsilveira;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmbienteConfiguration {
    @Bean("development")
    public Ambiente development() {
        return new Ambiente() {
            @Override
            public void selecionaAmbiente() {
                System.out.println("Development Environment");
            }
        };
    }

    @Bean("production")
    public Ambiente production() {
        return new Ambiente() {
            @Override
            public void selecionaAmbiente() {
                System.out.println("Production Environment");
            }
        };
    }
}
