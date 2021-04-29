package br.com.moreirallan.manipulacaoarquivos.controller;

import br.com.moreirallan.manipulacaoarquivos.base64.Base64Utils;
import br.com.moreirallan.manipulacaoarquivos.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("base64")
public class Base64Controller {

    @Autowired
    private DownloadService downloadService;

    @RequestMapping(path = "download", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ByteArrayResource> toCsvDownload(@RequestBody String base64, @RequestParam (name = "nome_arquivo", required = false) String nomeArquivo) {
        return downloadService.download(Base64Utils.fromBase64(base64), nomeArquivo);
    }
}
