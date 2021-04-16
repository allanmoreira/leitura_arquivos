package br.com.moreirallan.manipulacaoarquivos.controller;

import br.com.moreirallan.manipulacaoarquivos.service.LeituraGravacaoArquivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("arquivo")
public class LeituraGravacaoArquivoController {

    @Autowired
    private LeituraGravacaoArquivoService LeituraGravacaoArquivo;

    @RequestMapping(path = "ler", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object ler(@RequestParam(name = "arquivo", required = false) String arquivo){
        return LeituraGravacaoArquivo.ler(arquivo);
    }

    @RequestMapping(path = "novo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object novo(@RequestParam(name = "arquivo", required = false) String arquivo){
        LeituraGravacaoArquivo.novo(arquivo);
        return null;
    }
}
