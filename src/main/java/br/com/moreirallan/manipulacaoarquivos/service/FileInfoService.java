package br.com.moreirallan.manipulacaoarquivos.service;

import br.com.moreirallan.manipulacaoarquivos.arquivos.FileInfoResponse;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FileInfoService {

    public FileInfoResponse dadosArquivo(File file){
        FileInfoResponse response = new FileInfoResponse();
        String caminhoCompletoArquivo = caminhoCompletoArquivo(file);
        int indicePontoExtensao = caminhoCompletoArquivo.lastIndexOf(".");

        response.setSeparadorDiretorio(separadorDiretorio());
        response.setExtensao(getExtensao(caminhoCompletoArquivo, indicePontoExtensao));
        response.setNomeArquivo(getNomeArquivo(caminhoCompletoArquivo, separadorDiretorio(), indicePontoExtensao));
        response.setCaminhoArquivo(getCaminhoArquivo(caminhoCompletoArquivo, separadorDiretorio()));
        response.setCaminhoRelativo1(caminhoRelativo1(response.getNomeArquivo()));
        response.setCaminhoRelativo2(caminhoRelativo2(response.getNomeArquivo()));
        return response;
    }

    private String getExtensao(String caminhoCompletoArquivo, int indicePontoExtensao) {
        return caminhoCompletoArquivo.substring(indicePontoExtensao + 1);
    }

    private String separadorDiretorio(){
        return File.separator;
    }

    private String diretorioArquivo(File file){
        return file.getParent();
    }

    private String getNomeArquivo(String caminhoCompletoArquivo, String separadorDiretorio, int indicePontoExtensao) { // gets filename without extension
        int indiceSeparador = caminhoCompletoArquivo.lastIndexOf(separadorDiretorio);
        return caminhoCompletoArquivo.substring(indiceSeparador + 1, indicePontoExtensao);
    }

    private String caminhoCompletoArquivo(File file){
        return file.getAbsolutePath();
    }

    private String getCaminhoArquivo(String caminhoCompletoArquivo, String separadorDiretorio) {
        int sep = caminhoCompletoArquivo.lastIndexOf(separadorDiretorio);
        return caminhoCompletoArquivo.substring(0, sep);
    }

    private String caminhoRelativo1(String nomeArquivo){
        return new File("src/" + nomeArquivo).getAbsolutePath();

    }

    private String caminhoRelativo2(String nomeArquivo){
        String localDir = System.getProperty("user.dir");
        return new File(localDir + "\\" + nomeArquivo).getAbsolutePath();
    }
}
