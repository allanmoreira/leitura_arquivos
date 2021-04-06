package br.com.moreirallan.manipulacaoarquivos.base64;

import org.apache.commons.codec.binary.Base64;

public class Base64Utils {
    public static String codificaArquivoParaBase64(byte[] bytes) {
        return new String(Base64.encodeBase64(bytes));
    }
}
