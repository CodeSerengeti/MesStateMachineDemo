package com.messtatemachine.mes;

import com.messtatemachine.mes.command.StartupRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MesApplication {
    @Bean
    public StartupRunner startupRunner() {
        return new StartupRunner();
    }
    public static void main(String[] args) {
        SpringApplication.run(MesApplication.class, args);
    }

}
