package br.com.carlos.alphanumericcnpjgeneratorvalidator.generator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generate")
public class GeneratorController {
    @GetMapping
    public ResponseEntity<GeneratorResponseDTO> generate(@RequestBody GeneratorRequestDTO request) {
        return ResponseEntity.ok().build();
    }
}
