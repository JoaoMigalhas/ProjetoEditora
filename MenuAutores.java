import java.util.Scanner;

public class MenuAutores {
    private Scanner teclado = new Scanner(System.in);
    private BancoAutores bancoAutores = new BancoAutores();

    public MenuAutores(){
        this.exibir();
    }

    private void exibir(){
        int opcao = 0;

        do {
            System.out.println("-------------");
            System.out.println("MENU AUTORES");
            System.out.println("1. Adicionar");
            System.out.println("2. Alterar");
            System.out.println("3. Excluir");
            System.out.println("4. Pesquisar");
            System.out.println("9. Sair");
            System.out.println("Digite a sua opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1){
                Autores autores = new Autores();
                System.out.println("Digite o código do autor(a): ");
                autores.setCodigo(teclado.nextInt());
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
                System.out.println("Digite o nome do autor(a): ");
                autores.setNome(teclado.nextLine());
                System.out.println("Digite o pseudonimo do autor(a): ");
                autores.setPseudonimo(teclado.nextLine());
                teclado.nextLine();
                System.out.println("Digite uma observação sobre o autor(a): ");
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
                    System.out.println(localizado.getCodigo() + 
                    " - " + localizado.getNome() +
                    " - " + localizado.getPseudonimo());
                }
            }

        } while (opcao != 9);
    }
}

