/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moreirallan.manipulacaoarquivos.arquivos;

/**
 *
 * @author Allan Moreira
 */

import br.com.moreirallan.manipulacaoarquivos.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class LeituraGravacaoArquivo {

    @Autowired
    private FileInfoService fileInfoService;

    /**
     * Gera randomicamente 100 numeros inteiros entre 0 e 100, e grava estes
     * números em um arquivo texto separados por “,”. O nome do arquivo e
     * passado por parametro
     */
    public void novo(String nomeArq) {
        try {
            // Abre o arquivo
            FileWriter f = new FileWriter(nomeArq);
            Random r = new Random();
            try {
                // Grava as informacoes no arquivo
                for (int i = 0; i < 100; i++) {
                    if (i == 99) {
                        f.write(r.nextInt(101) + "");
                    } else {
                        f.write(r.nextInt(101) + ",");
                    }
                }
            } finally {
                // Fecha o arquivo
                f.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Troca todas as ocorrências de uma string @palavraAntiga por uma string @novaPalavra em um arquivo.
     *
     * @param caminhoCompletoArquivo localização do arquivo a ser editado
     * @param palavraAntiga palavra a ser pesquisada e posteriormente trocada
     * @param novaPalavra palavra a ser substituída pela pesquisada
     */
    public void  editar(String caminhoCompletoArquivo, String palavraAntiga, String novaPalavra) {
        String diretorioArquivo = fileInfoService.dadosArquivo(new File(caminhoCompletoArquivo)).getCaminhoArquivo();
        List<String> lines = new ArrayList<>();
        String line;

        try {
            File file = new File(caminhoCompletoArquivo);
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                if (line.contains(palavraAntiga))
                    line = line.replace(palavraAntiga, novaPalavra);
                lines.add(line);
            }
            fileReader.close();
            br.close();

            FileWriter fw = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(fw);
            for(String s : lines)
                out.write(s + "\n");
            out.flush();
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Le as linhas do arquivo cujo nome é passado por parametro, e armazena-as em um arranjo.
     *
     * @return arranjo com as linhas lidas do arquivo ou null caso a leitura nao seja feita com sucesso.
     */
    public List<String> ler(String nomeArq) {
        List<String> listaQueries = new ArrayList<>();

        try {
            // Abre o arquivo
            FileReader f = new FileReader(nomeArq);
            BufferedReader buf = new BufferedReader(f);
            try {
                String line;
                String[] str;
                // Le as informacoes do arquivo (apenas uma linha por vez)
                while ((line = buf.readLine()) != null) {
                    // Opção 1: quebra a linha lida em string tendo como divisor o caracter definido por parametro
                    str = line.split(";");
                    for (String s : str) {
                        // Caso a linha esteja vazia, não a adiciona ao array
                        if(!"".equals(s))
                            listaQueries.add(s);
                    }
                    // Opção 2: adiciona a linha lida ao array, caso não necessite do split
//                    listaQueries.add(line);
                }
            } finally {
                // Fecha o arquivo
                f.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaQueries;
    }

    /**
     * Copia o conteúdo de um arquivo para outro.
     *
     * @param caminhoCompletoArquivo
     */
    public static void copiaDadosArquivo(String caminhoCompletoArquivo) {
        List<String> lines = new ArrayList<>();
        String line;

        try {
            File file = new File(caminhoCompletoArquivo);
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            fileReader.close();
            br.close();

            FileWriter fw = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(fw);
            for(String s : lines)
                out.write(s + "\n");
            out.flush();
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
