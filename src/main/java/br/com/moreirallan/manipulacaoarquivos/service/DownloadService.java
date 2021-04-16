package br.com.moreirallan.manipulacaoarquivos.service;

import br.com.moreirallan.manipulacaoarquivos.utils.ArquivoUtils;
import org.apache.tika.Tika;
import org.apache.tika.mime.MimeType;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Service
public class DownloadService {
    @Autowired
    private ArquivoUtils arquivoUtils;
    private final Tika tika = new Tika();

    public ResponseEntity<ByteArrayResource> download(ServletContext servletContext, String arquivo) throws Exception {
        try {
            File file = new File(arquivo);
            byte[] bytesArray = new byte[(int) file.length()];
            FileInputStream fis = new FileInputStream(file);
            fis.read(bytesArray);
            fis.close();

            MediaType mediaType = arquivoUtils.getMediaType(servletContext, arquivo);

            return downloadAux(bytesArray, mediaType, file.getName());
        } catch (RuntimeException | IOException | Error ex) {
            throw new Exception(ex.getMessage());
        }
    }


    public ResponseEntity<ByteArrayResource> download(byte[] bytes, String nomeArquivo) {
        MediaType mediaType = MediaType.APPLICATION_OCTET_STREAM;
        try {
            String mime = tika.detect(bytes);
            mediaType = MediaType.valueOf(mime);
            if (ObjectUtils.isEmpty(nomeArquivo)) {
                MimeTypes allTypes = MimeTypes.getDefaultMimeTypes();
                MimeType type = allTypes.forName(mime);
                nomeArquivo = "arquivo" + type.getExtension();
            }
        } catch (RuntimeException | MimeTypeException ex) {
            // gerar log
        }
        return downloadAux(bytes, mediaType, nomeArquivo);
    }

    private ResponseEntity<ByteArrayResource> downloadAux(byte[] bytes, MediaType mediaType, String nomeArquivo){
        ByteArrayResource inputStreamSource = new ByteArrayResource(bytes);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + nomeArquivo)
                .contentType(mediaType)
                .body(inputStreamSource);
    }
}
