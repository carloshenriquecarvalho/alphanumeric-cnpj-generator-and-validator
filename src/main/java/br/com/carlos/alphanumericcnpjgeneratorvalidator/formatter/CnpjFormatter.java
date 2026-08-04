package br.com.carlos.alphanumericcnpjgeneratorvalidator.formatter;

public class CnpjFormatter {
    static String cnpj;
    public CnpjFormatter(String oldCnpj) {

        cnpj = oldCnpj.substring(0, 2) +
                "." +
                oldCnpj.substring(2, 5) +
                "." +
                oldCnpj.substring(5, 8) +
                "/" +
                oldCnpj.substring(8, 12) +
                "-" +
                oldCnpj.substring(12, 14);
    }

    public  String getCnpj(){
        return cnpj;
    }
}
