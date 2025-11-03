public class Editoras {
    
    //criar os atributos da classe editora
    private int codigo;
    private String nome;
    private String sigla;
    private String observacoes;

    //getters e setters
    //codigo da editora
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public int getCodigo() {return this.codigo;}

    //nome da editora
    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return this.nome;}
    //sigla 
    public void setSigla(String sigla) {this.sigla = sigla;}
    public String getSigla() {return this.sigla;}
    //observacoes
    public void setObservacoes(String observacoes) {this.observacoes = observacoes;}
    public String getObservacoes() {return this.observacoes;}
}
