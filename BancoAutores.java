import java.util.ArrayList;
import java.util.List;

public class BancoAutores {
    private List<Autores> lista;
    private int numeroAutores;
    
    public BancoAutores() {
        lista = new ArrayList<Autores>();
        numeroAutores = 0;
    }

    //metodo de adcionar
    public void adicionar(Autores autores) {
        Autores localizado = this.pesquisar(autores.getCodigo());

        if (localizado == null){
            lista.add(autores);
            numeroAutores = numeroAutores + 1;
            System.out.println("Autor(a) adiconado!!");
        } else {
            System.out.println("Já existe um(a) autor(a) com esse código!");
        }
    }

    //metodo de excluir
    public void excluir(int codigo){
        Autores localizado = null;

        for (Autores item : lista){
            if (item.getCodigo() == codigo){
                localizado = item;
                break;
            }
        }

        if (localizado == null){
            System.out.println("Autor(a) não localizado!");
        } else {
            lista.remove(localizado);
            this.numeroAutores = this.numeroAutores - 1;
            System.out.println("Autor(a) removido!!");
        }
    }

    //metodo de alterar
    public void alterar(Autores autores){
        Boolean localizado = false;

        for (Autores item : lista){
            if(item.getCodigo() == autores.getCodigo()){
                item.setNome(autores.getNome());
                item.setPseudonimo(autores.getPseudonimo());
                item.setObservacoes(autores.getObservacoes());
                localizado = true;
                break;
            }
        }

        if (localizado == false){
            System.out.println("Autor(a) não econtrado!");
        } else {
            System.out.println("Autor(a) alterado!!");
        }
    }

     //metodo pesquisar
        public Autores pesquisar(int codigo){
            Autores localizado = null;

            for (Autores item : lista){
                if (item.getCodigo() == codigo){
                    localizado = item;
                    break;
                }
            }

            if(localizado == null){
                return null;
            } else {
                return localizado;
            }
        }

    //numero de livros
    public int getNumeroAutores(){
        return this.numeroAutores;
    }
}
