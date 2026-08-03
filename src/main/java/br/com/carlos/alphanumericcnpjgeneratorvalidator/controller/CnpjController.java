package br.com.carlos.alphanumericcnpjgeneratorvalidator.controller;

import br.com.carlos.alphanumericcnpjgeneratorvalidator.dto.CnpjDTO;
import br.com.carlos.alphanumericcnpjgeneratorvalidator.validator.ValidatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cnpj/api/v1")
public class CnpjController {

    public CnpjController(ValidatorService validatorService) {

    }
    @PostMapping("/validate")
    public ResponseEntity<String> validateCnpj(@RequestBody CnpjDTO request){
        Boolean isCnpjValid = ValidatorService.isValid(request.cnpj());

        return ResponseEntity.ok(String.format("O cnpj é %s", isCnpjValid ? "válido" : "inválido"));
    }

}
