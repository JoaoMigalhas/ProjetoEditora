    import java.util.ArrayList;
    import java.util.List;

    public class BancoEditora {
        private List<Editoras> lista;
        private int numeroEditoras;
        
        public BancoEditora() {
            lista = new ArrayList<Editoras>();
            numeroEditoras = 0;
        }

        //metodo de adcionar
        public void adicionar(Editoras editoras) {
            Editoras localizado = this.pesquisar(editoras.getCodigo());

            if (localizado == null){
                lista.add(editoras);
                numeroEditoras = numeroEditoras + 1;
                System.out.println("Editora adiconada!!");
            } else {
                System.out.println("Já existe uma editora com esse código!");
            }
        }

        //metodo de excluir
        public void excluir(int codigo){
            Editoras localizado = null;

            for (Editoras item : lista){
                if (item.getCodigo() == codigo){
                    localizado = item;
                    break;
                }
            }

            if (localizado == null){
                System.out.println("Editora não localizada!");
            } else {
                lista.remove(localizado);
                this.numeroEditoras = this.numeroEditoras - 1;
                System.out.println("Editora removido!!");
            }
        }

        //metodo de alterar
        public void alterar(Editoras editoras){
            Boolean localizado = false;

            for (Editoras item : lista){
                if(item.getCodigo() == editoras.getCodigo()){
                    item.setNome(editoras.getNome());
                    item.setSigla(editoras.getSigla());
                    item.setObservacoes(editoras.getObservacoes());
                    localizado = true;
                    break;
                }
            }

            if (localizado == false){
                System.out.println("Editora não econtrada!");
            } else {
                System.out.println("Editora alterada!!");
            }
        }

        //metodo pesquisar
            public Editoras pesquisar(int codigo){
                Editoras localizado = null;

                for (Editoras item : lista){
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

        //pesquisar pelo nome
        public Editoras pesquisar(String nome){
            Editoras localizado = null;

            for (Editoras item : lista){
                if (item.getNome().equals(nome)){
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

        //numero de editoras
        public int getNumeroEditoras(){
            return this.numeroEditoras;
        }

        //imprimir todas as editoras
        public void imprimirEditoras(){
            if (getNumeroEditoras() == 0){
                System.out.println("Nenhuma editora cadastrada!");
            } else {
            for (Editoras item : lista){
                System.out.println(item.toString());
            }
        }
    }
}
