package br.com.moreirallan.manipulacaoarquivos.controller;

import br.com.moreirallan.core.utils.ArquivoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("public/file_info")
public class FileInfoController {

    @Autowired
    private ArquivoUtils arquivoUtils;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object info(@RequestParam(required = false) String arquivo) throws IOException {
        return arquivoUtils.info(arquivo);
    }

    @RequestMapping(path = "dir", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object dir(@RequestParam(name = "path", required = false) String diretorio) throws IOException {
        diretorio = "D:\\Google Drive\\Projetos\\manipulacao_arquivos\\src\\main\\java\\br\\com\\moreirallan\\manipulacaoarquivos\\" + diretorio;
        return arquivoUtils.diretorio(diretorio);
    }
}
