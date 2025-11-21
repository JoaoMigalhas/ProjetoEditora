import java.util.Scanner;

public class MenuLivros {
    private Scanner teclado = new Scanner(System.in);
    private BancoLivros bancoLivros = new BancoLivros();

    //metodo construtor
    public MenuLivros(){
        this.exibir();
    }

    private void exibir(){
        int opcao = 0;

        do {
            System.out.println("------------");
            System.out.println("MENU LIVROS");
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
                Livros livros = new Livros();
                System.out.println("Codigo gerado automaticamente do livro: " + livros.getCodigo());
                teclado.nextLine();
                System.out.println("Digite o nome do livro: ");
                livros.setNome(teclado.nextLine());
                System.out.println("Digite o Isbn do livro: ");
                livros.setIsbn(teclado.nextInt());
                System.out.println("Digite o ano de publicação do livro: ");
                livros.setAno(teclado.nextInt());
                System.out.println("Digite uma observação sobre o livro: ");
                livros.setObservacoes(teclado.nextLine());

                bancoLivros.adicionar(livros);

            } else if (opcao == 2){
                Livros livros = new Livros();
                System.out.println("Digite o código do livro que deseja alterar: ");
                livros.setCodigo(teclado.nextInt());
                teclado.nextLine();
                System.out.println("Digite o novo nome do livro: ");
                livros.setNome(teclado.nextLine());
                System.out.println("Digite o novo Isbn do livro: ");
                livros.setIsbn(teclado.nextInt());
                System.out.println("Digite o novo ano de publicação do livro: ");
                livros.setAno(teclado.nextInt());
                System.out.println("Digite uma nova observação sobre o livro: ");
                livros.setObservacoes(teclado.nextLine());
                teclado.nextLine();

                bancoLivros.alterar(livros);

            } else if (opcao == 3){
                System.out.println("Digite o codigo do livro que deseja excluir: ");
                int codigo = teclado.nextInt();
                teclado.nextLine();
                bancoLivros.excluir(codigo);

            } else if (opcao == 4){
                System.out.println("Digite o codigo do livro que deseja pesquisar: ");
                int codigo = teclado.nextInt();
                teclado.nextLine();
                Livros localizado = bancoLivros.pesquisar(codigo);

                if(localizado == null){
                    System.out.println("Livro não encontrado!");
                } else {
                    System.out.println("Codigo do livro: " + localizado.getCodigo() + 
                    " - Nome do livro: " + localizado.getNome() +
                    " - ISBN do livro: " + localizado.getIsbn());
                }
            } else if (opcao == 5){
                System.out.println("Digite o nome do livro que deseja pesquisar: ");
                String nome = teclado.nextLine();
                teclado.nextLine();
                Livros localizado = bancoLivros.pesquisar(nome);

                if(localizado == null){
                    System.out.println("Livro não encontrado!");
                } else {
                    System.out.println("Codigo do livro: " + localizado.getCodigo() + 
                    " - Nome do livro: " + localizado.getNome() +
                    " - ISBN do livro: " + localizado.getIsbn());
                }
            } else if (opcao == 6){
                System.out.println("Lista de todos os livros:");
                bancoLivros.imprimirLivros();
            } else if (opcao == 7){
                System.out.println("Número de livros cadastrados: " + bancoLivros.getNumeroLivros());
            }
        } while (opcao != 9);
    }
}

