public class Livros {
    //atributos da classe livros
    private int codigo;
    private String nome;
    private int anodepublicacao;
    private int isbn;
    private String observacoes;

    //getters e setters
    //codigo do livro
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public int getCodigo() {return this.codigo;}

    //nome do livro
    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return this.nome;}

    //ano de publicacao
    public void setAno(int anodepublicacao) {this.anodepublicacao = anodepublicacao;}
    public int getAno() {return this.anodepublicacao;}

    //isbn
    public void setIsbn(int isbn) {this.isbn = isbn;}
    public int getIsbn() {return this.isbn;}

    //obsevacoes
    public void setObservacoes(String observacoes) {this.observacoes = observacoes;}
    public String getObservacoes() {return this.observacoes;}
}
