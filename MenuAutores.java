import java.util.Scanner;

//classe estatica
public class MenuAutores {
    private static Scanner teclado = new Scanner(System.in);
    private static BancoAutores bancoAutores = new BancoAutores();

    public static void exibir(){
        int opcao = 0;

        do {
            System.out.println("-------------");
            System.out.println("MENU AUTORES");
            System.out.println("1. Adicionar");
            System.out.println("2. Alterar");
            System.out.println("3. Excluir");
            System.out.println("4. Pesquisar(codigo)");
            System.out.println("5. Pesquisar(nome)");
            System.out.println("6. Imprimir todos");
            System.out.println("7. Contador de registros");
            System.out.println("9. Sair");
            System.out.println("Digite a sua opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1){
                Autores autores = new Autores();
                System.out.println("Codigo gerado automaticamente do autor(a): " + autores.getCodigo());
                teclado.nextLine();
                System.out.println("Digite o nome do autor(a): ");
                autores.setNome(teclado.nextLine());
                System.out.println("Digite o pseudonimo do autor(a): ");
                autores.setPseudonimo(teclado.nextLine());
                System.out.println("Digite uma observação sobre o autor(a): ");
                autores.setObservacoes(teclado.nextLine());

                bancoAutores.adicionar(autores);
            } else if (opcao == 2){
                Autores autores = new Autores();
                System.out.println("Digite o código do autor(a) que deseja alterar: ");
                autores.setCodigo(teclado.nextInt());
                teclado.nextLine();
                System.out.println("Digite o novo nome do autor(a): ");
                autores.setNome(teclado.nextLine());
                System.out.println("Digite o novo pseudonimo do autor(a): ");
                autores.setPseudonimo(teclado.nextLine());
                teclado.nextLine();
                System.out.println("Digite uma nova observação sobre o autor(a): ");
                autores.setObservacoes(teclado.nextLine());
                teclado.nextLine();

                bancoAutores.alterar(autores);
            } else if (opcao == 3){
                System.out.println("Digite o codigo do autor(a) que deseja excluir: ");
                int codigo = teclado.nextInt();
                teclado.nextLine();
                bancoAutores.excluir(codigo);
            } else if (opcao == 4){
                System.out.println("Digite o codigo do autor(a) que deseja pesquisar: ");
                int codigo = teclado.nextInt();
                teclado.nextLine();
                Autores localizado = bancoAutores.pesquisar(codigo);

                if(localizado == null){
                    System.out.println("Autor(a) não encontrado!");
                } else {
                    System.out.println("Codigo do autor(a): " + localizado.getCodigo() + 
                    " - Nome do autor(a): " + localizado.getNome() +
                    " - Pseudonimo do autor(a): " + localizado.getPseudonimo());
                }
            } else if (opcao == 5){
                System.out.println("Digite o nome do autor(a) que deseja pesquisar: ");
                String nome = teclado.nextLine();
                teclado.nextLine();
                Autores localizado = bancoAutores.pesquisar(nome);

                if(localizado == null){
                    System.out.println("Autor(a) não encontrado!");
                } else {
                    System.out.println("Codigo do autor(a): " + localizado.getCodigo() + 
                    " - Nome do autor(a): " + localizado.getNome() +
                    " - Pseudonimo do autor(a): " + localizado.getPseudonimo());
                }
            } else if (opcao == 6){
                System.out.println("Lista de autores cadastrados:");
                bancoAutores.imprimirAutores();
            } else if (opcao == 7){
                System.out.println("Número de autores cadastrados: " + bancoAutores.getNumeroAutores());
            }

        } while (opcao != 9);
    }
}

