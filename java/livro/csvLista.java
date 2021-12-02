package livro;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import acervo.Acervo;

public class csvLista {
    public static void gerarCsvLivros(Path arquivo) {
        List<Acervo> func = leCsv(arquivo);

        gerarCsvNovo("Livro_filtrado.csv",func);//passando lista do acervo

        func.forEach((f) -> {
            System.out.println("Genero: " + f.getGenero() + "Autor: " + f.getAutor());
        });
        
    }

    //LEITURA

    private static void gerarCsvNovo(String string, List<Acervo> func) {
        String cabecalho = "Genero, Autor\n";

        Path arquivoFinal = Paths.get(nomeArquivo);

        try {
            Files.writeString(arquivoFinal, cabecalho);

            StringBuilder builder - new StringBuilder(); 


            /*
            //tirar quem nao tem filho, nao precisamos no projeto livro
            //esta filtrando só pega que tem filho, quem nao tem sera filtrado
            func.stream().filter((f) -> f.getNumFihos()!=0).forEach((f)-> {
                builder.append(f.getId() + ",");
                builder.append(f.getNumFihos() + ",");
                builder.append(f.getSalario() + "\n");
        
            });
            */

            Files.writeString(arquivoFinal, builder.toString(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        Files.writeString(arquivoFinal, cabecalho);
    }

    private static List<Acervo> leCsv (Path arquivo){
        List<Acervo> livros = new ArrayList<>();
        try {
            List<String> linhas = Files.readAllLines(arquivo);//Ler linha por linha do csv e colocar em uma lista
            linhas.remove(o);
            //para cada linha criar um livro
            linhas.forEach((linha) -> {
             String[] linhaSplit = linha.split(", ");  
             Acervo func;
            livro = func = new livro(Integer.parseInt(linhaSplit[0]), 
                                                    Integer.parseInt(linhaSplit[3]), 
                                                    Double.parseDouble(linhaSplit[4]); 
            livros.add(func);
            };
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return livros;
    }
    
}
