package br.com.moreirallan.manipulacaoarquivos.controller;

import br.com.moreirallan.core.utils.Base64Utils;
import br.com.moreirallan.manipulacaoarquivos.model.CSVRequest;
import br.com.moreirallan.manipulacaoarquivos.service.CSVService;
import br.com.moreirallan.manipulacaoarquivos.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("csv")
public class CSVController {

    @Autowired
    private CSVService csvService;
    @Autowired
    private DownloadService downloadService;

    @RequestMapping(path = "to_csv", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object lista(@RequestBody CSVRequest request){
        return Base64Utils.toBase64(csvService.toCsv(request));
    }

    @RequestMapping(path = "to_csv/download", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ByteArrayResource> toCsvDownload(@RequestBody CSVRequest request) {
        return downloadService.download(csvService.toCsv(request), "arquivo.csv");
    }
}
