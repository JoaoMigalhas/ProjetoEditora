public class Autores {
    //atributos da classe de autores dos livros
    private int codigo;
    private String nome;
    private String pseudonimo;
    private String observacoes;

    //getters e setters
    //codigo
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public int getCodigo() {return this.codigo;}

    //nome
    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return this.nome;}

    //pseudonimo
    public void setPseudonimo(String pseudonimo) {this.pseudonimo = pseudonimo;}
    public String getPseudonimo() {return this.pseudonimo;}

    //observacoes
    public void setObservacoes(String observacoes) {this.observacoes = observacoes;}
    public String getObservacoes() {return this.observacoes;}
}
