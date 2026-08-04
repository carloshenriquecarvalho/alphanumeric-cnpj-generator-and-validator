package br.com.carlos.alphanumericcnpjgeneratorvalidator.service;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class GeneratorService {
    static ValidatorService validatorService;

    static SecureRandom RANDOM = new SecureRandom();
    static String CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String NUM_SET = "0123456789";

    public static String generate() {
        StringBuilder sb = new StringBuilder(12);
        for(int i=0;i<8;i++) {
            int index = RANDOM.nextInt(CHAR_SET.length());
            sb.append(CHAR_SET.charAt(index));
        }
        for(int i=0;i<4;i++) {
            int index = RANDOM.nextInt(NUM_SET.length());
            sb.append(NUM_SET.charAt(index));
        }
        return sb.toString();
    };
}
