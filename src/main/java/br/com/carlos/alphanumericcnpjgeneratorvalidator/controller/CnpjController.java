package br.com.carlos.alphanumericcnpjgeneratorvalidator.controller;

import br.com.carlos.alphanumericcnpjgeneratorvalidator.dto.CnpjDTO;
import br.com.carlos.alphanumericcnpjgeneratorvalidator.dto.CnpjFormatter;
import br.com.carlos.alphanumericcnpjgeneratorvalidator.service.GeneratorService;
import br.com.carlos.alphanumericcnpjgeneratorvalidator.service.ValidatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cnpj/api/v1")
public class CnpjController {

    public CnpjController(ValidatorService validatorService) {

    }
    @PostMapping("/validate")
    public ResponseEntity<Boolean> validateCnpj(@RequestBody CnpjDTO request){
        String completoCnpj = String.format("%s" + "%s",request.cnpj(), ValidatorService.calculaDV(request.cnpj()));
        boolean isCnpjValid = ValidatorService.isValid(completoCnpj);

        return ResponseEntity.ok(isCnpjValid);
    }

    @GetMapping("/generate")
    public ResponseEntity<CnpjDTO> generateCnpj(){

        String generatedValue = GeneratorService.generate();

        String completeCnpj = String.format("%s" + "%s",generatedValue, ValidatorService.calculaDV(generatedValue));
        System.out.println(new CnpjFormatter(completeCnpj));

        return ResponseEntity.ok(new CnpjDTO(CnpjFormatter.getCnpj()));
    }

}
