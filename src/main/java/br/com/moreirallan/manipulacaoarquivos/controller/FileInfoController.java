package br.com.moreirallan.manipulacaoarquivos.controller;

import br.com.moreirallan.manipulacaoarquivos.arquivos.CaminhoConstants;
import br.com.moreirallan.manipulacaoarquivos.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("file_info")
public class FileInfoController {

    @Autowired
    private FileInfoService fileInfoService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object lista(@RequestParam(name = "arquivo", required = false) String arquivo){
        return fileInfoService.dadosArquivo(new File(arquivo));
    }
}
