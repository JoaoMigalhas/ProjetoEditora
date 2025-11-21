public class Autores extends CadastroBase {
    //atributos da classe de autores dos livros
    private String pseudonimo;
    private String observacoes;

    //getters e setters
    //pseudonimo
    public void setPseudonimo(String pseudonimo) {this.pseudonimo = pseudonimo;}
    public String getPseudonimo() {return this.pseudonimo;}

    //observacoes
    public void setObservacoes(String observacoes) {this.observacoes = observacoes;}
    public String getObservacoes() {return this.observacoes;}

    @Override
    public String toString() {
        return this.getCodigo()
          + " - " + this.getNome() 
          + " - " + this.getPseudonimo()
          + " - " + this.getObservacoes();
    }
}
