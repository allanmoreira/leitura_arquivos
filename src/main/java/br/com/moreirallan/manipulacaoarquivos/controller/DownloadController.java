package br.com.moreirallan.manipulacaoarquivos.controller;

import br.com.moreirallan.core.utils.DownloadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public/download")
public class DownloadController {

    @Autowired
    private DownloadUtils downloadUtils;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ByteArrayResource> toCsvDownload(
            @RequestParam (name = "nome_arquivo") String nomeArquivo
    ) throws Exception {
        return downloadUtils.download("C:\\Users\\allan.moreira_souths\\Downloads\\" + nomeArquivo);
    }
}
