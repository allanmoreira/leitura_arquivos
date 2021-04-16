package br.com.moreirallan.manipulacaoarquivos.utils;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

@Component
public class ArquivoUtils {

    public MediaType getMediaType(ServletContext servletContext, String nomeArquivo) {
        String mineType = servletContext.getMimeType(nomeArquivo);
        try {
            return MediaType.parseMediaType(mineType);
        } catch (Exception e) {
            return MediaType.APPLICATION_OCTET_STREAM;
        }
    }
}
