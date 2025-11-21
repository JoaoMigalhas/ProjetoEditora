public class Livros extends CadastroBase {
    //atributos da classe livros
    private int anodepublicacao;
    private int isbn;
    private String observacoes;

    //getters e setters
    //ano de publicacao
    public void setAno(int anodepublicacao) {this.anodepublicacao = anodepublicacao;}
    public int getAno() {return this.anodepublicacao;}

    //isbn
    public void setIsbn(int isbn) {this.isbn = isbn;}
    public int getIsbn() {return this.isbn;}

    //obsevacoes
    public void setObservacoes(String observacoes) {this.observacoes = observacoes;}
    public String getObservacoes() {return this.observacoes;}

    @Override
    public String toString() {
        return this.getCodigo()
          + " - " + this.getNome() 
          + " - " + this.getAno()
          + " - " + this.getIsbn()
          + " - " + this.getObservacoes();
    }
}
