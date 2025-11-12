import java.util.Scanner;

public class MenuPrincipal {
    private Scanner teclado = new Scanner(System.in);

    public void exibir() {
        int opcao = 0;

        do {
            System.out.println("---------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Editoras");
            System.out.println("2. Livros");
            System.out.println("3. Autores");
            System.out.println("9. Sair");
            System.out.println("Digite a sua opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1){
                MenuEditoras menuEditoras = new MenuEditoras();
                menuEditoras.exibir();
            } else if (opcao == 2){
                //exibir com metodo construtor
                MenuLivros menuLivros = new MenuLivros();
            } else if (opcao == 3){
                //exibir com classe estatica
                MenuAutores.exibir();
            }

        } while (opcao != 9);
    }
}
