import java.util.Scanner;

public class MenuEditoras {
    private Scanner teclado = new Scanner(System.in);
    private BancoEditora bancoEditora = new BancoEditora();


    public void exibir(){
        int opcao = 0;

        do {
            System.out.println("--------------");
            System.out.println("MENU EDITORAS");
            System.out.println("1. Adicionar");
            System.out.println("2. Alterar");
            System.out.println("3. Excluir");
            System.out.println("4. Pesquisar");
            System.out.println("9. Sair");
            System.out.println("Digite a sua opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1){
                Editoras editoras = new Editoras();
                System.out.println("Digite o código da editora: ");
                editoras.setCodigo(teclado.nextInt());
                teclado.nextLine();
                System.out.println("Digite o nome da editora: ");
                editoras.setNome(teclado.nextLine());
                System.out.println("Digite a sigla da editora: ");
                editoras.setSigla(teclado.nextLine());
                System.out.println("Digite uma observação sobre a editora: ");
                editoras.setObservacoes(teclado.nextLine());

                bancoEditora.adicionar(editoras);
            } else if (opcao == 2){
                Editoras editoras = new Editoras();
                System.out.println("Digite o código da editora que deseja alterar: ");
                editoras.setCodigo(teclado.nextInt());
                teclado.nextLine();
                System.out.println("Digite o nome da editora: ");
                editoras.setNome(teclado.nextLine());
                System.out.println("Digite a sigla da editora: ");
                editoras.setSigla(teclado.nextLine());
                System.out.println("Digite uma observação sobre a editora: ");
                editoras.setObservacoes(teclado.nextLine());

                bancoEditora.alterar(editoras);
            } else if (opcao == 3){
                System.out.println("Digite o codigo da editora que deseja excluir: ");
                int codigo = teclado.nextInt();
                teclado.nextLine();
                bancoEditora.excluir(codigo);
            } else if (opcao == 4){
                System.out.println("Digite o codigo da editora que deseja pesquisar: ");
                int codigo = teclado.nextInt();
                teclado.nextLine();
                Editoras localizado = bancoEditora.pesquisar(codigo);

                if(localizado == null){
                    System.out.println("Editora não encontrada!");
                } else {
                    System.out.println("Nome da editora: " + localizado.getCodigo() + 
                    " - Nome da editora: " + localizado.getNome() +
                    " - Sigla da editora: " + localizado.getSigla());
                }
            }

        } while (opcao != 9);
    }
}
