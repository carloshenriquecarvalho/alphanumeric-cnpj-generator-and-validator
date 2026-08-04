package br.com.carlos.alphanumericcnpjgeneratorvalidator.formatter;

public class CnpjFormatter {
    static String cnpj;
    public CnpjFormatter(String oldCnpj) {
        StringBuilder sb = new StringBuilder(18);
        sb.append(oldCnpj.substring(0, 2));
        sb.append(".");

        sb.append(oldCnpj.substring(2, 5));
        sb.append(".");

        sb.append(oldCnpj.substring(5, 8));
        sb.append("/");

        sb.append(oldCnpj.substring(8, 12));
        sb.append("-");

        sb.append(oldCnpj.substring(12, 14));

        cnpj = sb.toString();
    }

    public static String getCnpj(){
        return cnpj;
    }
}
