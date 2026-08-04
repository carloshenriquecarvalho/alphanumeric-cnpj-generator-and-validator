package br.com.carlos.alphanumericcnpjgeneratorvalidator;

import br.com.carlos.alphanumericcnpjgeneratorvalidator.service.ValidatorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.SecureRandom;


@SpringBootApplication
public class AlphanumericCnpjGeneratorValidatorApplication {


    public static void main(String[] args) {
        SpringApplication.run(AlphanumericCnpjGeneratorValidatorApplication.class, args);
    }

}
