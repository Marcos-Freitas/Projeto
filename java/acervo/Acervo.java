package acervo;

import livro.LivroBiblioteca;

import java.util.ArrayList;

public class Acervo {
    private static ArrayList<LivroBiblioteca> listaLivros = new ArrayList<>();

    //Método Getter
    public static ArrayList<LivroBiblioteca> getListaLivros() {
        return listaLivros;
    }
    //Adicionar um objeto na lista
    public static void adicionar(LivroBiblioteca l){
        listaLivros.add(l);
    }

    //Lista todos os objetos da lista
    public static String listar(){
        String saida = "";
        int i = 1;
        for(LivroBiblioteca l :listaLivros){
            saida +="\n====== Livro Nº " + (i++) + "=====\n";
            saida +=l.imprimir() + "\n";
        }
        return saida;
    }

    //Pesquisar por genero
    public static int pesquisar(String genero){
        int qtd =0;

        for(LivroBiblioteca l : listaLivros){
            if(l.getGenero().equalsIgnoreCase(genero)){
                qtd++;
            }
        }
       return qtd;
    }
}
