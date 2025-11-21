public class Editoras extends CadastroBase {
    
    //criar os atributos da classe editora
    private String sigla;
    private String observacoes;

    //getters e setters
    //sigla 
    public void setSigla(String sigla) {this.sigla = sigla;}
    public String getSigla() {return this.sigla;}
    //observacoes
    public void setObservacoes(String observacoes) {this.observacoes = observacoes;}
    public String getObservacoes() {return this.observacoes;}

    @Override
    public String toString() {
        return this.getCodigo()
          + " - " + this.getNome() 
          + " - " + this.getSigla()
          + " - " + this.getObservacoes();
    }
}
