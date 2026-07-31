package br.com.carlos.alphanumericcnpjgeneratorvalidator.formatter;

public class Formatter {
    private static final String REGEX_CARACTERES_FORMATACAO = "[./-]";

    public static String removeCaracteresFormatacao(String cnpj) {

        return cnpj.trim().replaceAll(REGEX_CARACTERES_FORMATACAO, "");
    }
}
