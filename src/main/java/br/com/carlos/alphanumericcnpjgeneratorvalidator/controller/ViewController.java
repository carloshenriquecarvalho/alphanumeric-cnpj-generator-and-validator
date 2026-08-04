package br.com.carlos.alphanumericcnpjgeneratorvalidator.controller;

import br.com.carlos.alphanumericcnpjgeneratorvalidator.formatter.CnpjFormatter;
import br.com.carlos.alphanumericcnpjgeneratorvalidator.service.GeneratorService;
import br.com.carlos.alphanumericcnpjgeneratorvalidator.service.ValidatorService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
    private final ValidatorService validatorService;

    public ViewController(ValidatorService validatorService) {
        this.validatorService = validatorService;
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/generate")
    public String generator(Model model, HttpSession session){
        String base = GeneratorService.generate();
        String cnpj = base + ValidatorService.calculaDV(base);

        model.addAttribute("cnpj", new CnpjFormatter(cnpj).getCnpj());

        session.setAttribute("cnpj", new CnpjFormatter(cnpj).getCnpj());
        return "index";
    }

    @PostMapping("/validate")
    public String validate(@RequestParam String cnpj, Model model, HttpSession session){
        boolean valid = ValidatorService.isValid(cnpj);

        model.addAttribute("searchedCnpj", cnpj);
        model.addAttribute("cnpj", session.getAttribute("cnpj"));
        model.addAttribute("valid", valid);

        return "index";
    }
}
