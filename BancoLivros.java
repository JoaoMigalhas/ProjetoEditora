import java.util.ArrayList;
import java.util.List;

public class BancoLivros {
    private List<Livros> lista;
    private int numeroLivros;
    
    public BancoLivros() {
        lista = new ArrayList<Livros>();
        numeroLivros = 0;
    }

    //metodo de adcionar
    public void adicionar(Livros livros) {
        Livros localizado = this.pesquisar(livros.getCodigo());

        if (localizado == null){
            lista.add(livros);
            numeroLivros = numeroLivros + 1;
            System.out.println("Livro adiconado!!");
        } else {
            System.out.println("Já existe um livro com esse código!");
        }
    }

    //metodo de excluir
    public void excluir(int codigo){
        Livros localizado = null;

        for (Livros item : lista){
            if (item.getCodigo() == codigo){
                localizado = item;
                break;
            }
        }

        if (localizado == null){
            System.out.println("Livro não localizado!");
        } else {
            lista.remove(localizado);
            this.numeroLivros = this.numeroLivros - 1;
            System.out.println("Livro removido!!");
        }
    }

    //metodo de alterar
    public void alterar(Livros livros){
        Boolean localizado = false;

        for (Livros item : lista){
            if(item.getCodigo() == livros.getCodigo()){
                item.setNome(livros.getNome());
                item.setAno(livros.getAno());
                item.setIsbn(livros.getIsbn());
                item.setObservacoes(livros.getObservacoes());
                localizado = true;
                break;
            }
        }

        if (localizado == false){
            System.out.println("Livro não econtrado!");
        } else {
            System.out.println("Livro alterado!!");
        }
    }

     //metodo pesquisar
        public Livros pesquisar(int codigo){
            Livros localizado = null;

            for (Livros item : lista){
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
    public int getNumeroLivros(){
        return this.numeroLivros;
    }
}
