package livro;

public class LivroBiblioteca {
    // Atributos
    private String titulo;
    private String autor;
    private String genero;
    private int qtdPaginas;
    private int ano;

    //Construtor
    public LivroBiblioteca() { } //Default

    public LivroBiblioteca(String titulo, String autor, String genero, int qtdPaginas, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.qtdPaginas = qtdPaginas;
        this.ano = ano;
    }
    //Métodos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    //Métodos da classe
    public String imprimir(){
        return"Título: " + titulo + "\nAutor: " +autor + "\n Genero: " + genero +
                "\nQuantidade de páginas: " + qtdPaginas + "\nAno: " +ano;
    }
}
