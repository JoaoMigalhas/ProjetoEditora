//classe abstrata base

import java.util.Random;

public abstract class CadastroBase {
    private int codigo;
    private String nome;

    //gerar um codigo aleatorio
    public CadastroBase() {
        Random gerador = new Random();
        this.codigo = gerador.nextInt(9999) + 1;
    }
    public int getCodigo() {return codigo;}
    public void setCodigo(int value) {
        if (value <= 0) {
            System.out.println("Código inválido, deve ser maior 0!");
        } else {
            this.codigo = value;
        }
    }

    public void setNome(String value) {
        if (value == null){
            System.out.println("Nome não pode ser nulo");
        } else if (value.toString().length() < 3){
            System.out.println("Nome deve ter no minimo 3 caracteres");
        } else {
            this.nome = value;
        }
    }
    public String getNome() {return nome;}
}
