package br.com.carlos.alphanumericcnpjgeneratorvalidator.controller;

import br.com.carlos.alphanumericcnpjgeneratorvalidator.dto.CnpjDTO;
import br.com.carlos.alphanumericcnpjgeneratorvalidator.formatter.CnpjFormatter;
import br.com.carlos.alphanumericcnpjgeneratorvalidator.service.GeneratorService;
import br.com.carlos.alphanumericcnpjgeneratorvalidator.service.ValidatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/generate")
    public String generator(Model model){
        String base = GeneratorService.generate();
        String cnpj = base + ValidatorService.calculaDV(base);

        model.addAttribute("cnpj", new CnpjFormatter(cnpj).getCnpj());

        return "index";
    }
}
