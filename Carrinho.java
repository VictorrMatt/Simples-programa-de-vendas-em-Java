
import java.util.Scanner;

public class Carrinho {

    public static void main(String args[]) {
        java.util.Scanner inteiro = new Scanner(System.in);
        java.util.Scanner flutuante = new Scanner(System.in);

        // Declaração de variáveis
        int rodando = 0;
        int escolha = 0;
        int produto = 0;
        int senha = 0;
        int quantidade = 0;
        float carrinho = 0f;
        float preco = 0f;
        float pamonha = 5.50f;
        float agua = 7.00f;
        float nescau = 8.00f;

        // Boas vindas
        System.out.println("Olá cliente amigo, seja muito bem vindo!");

        while (rodando != 2) {
            // Escolhas
            escolha = 0;
            produto = 0;
            System.out.print(" 1 -> Cliente\n 2 -> Funcionario\n 3 -> Sair\nEscolha: ");
            escolha = inteiro.nextInt();

            switch (escolha) {
                // Sessão de compras
                case 1:
                    while (produto != 4) {
                        // Lista de produtos
                        System.out.println("Digite o valor que corresponde ao produto desejado:");
                        System.out.print(" 1 -> Pamonha: R$" + pamonha + "\n 2 -> Agua: R$" + agua + "\n 3 -> Nescau: R$" + nescau + "\n 4 -> Parar\nEscolha: ");

                        produto = inteiro.nextInt();
                        
                        if (produto != 4) {
                            System.out.print("Quantidade: ");
                            quantidade = inteiro.nextInt();
                        }
                        
                        // Casos para cada produto
                        switch (produto) {
                            case 1:
                                System.out.println("Pamonha adicionado ao carrinho.");
                                carrinho += (pamonha * quantidade);
                                break;

                            case 2:
                                System.out.println("Agua adicionado ao carrinho.");
                                carrinho += (agua * quantidade);
                                break;

                            case 3:
                                System.out.println("Nescau adicionado ao carrinho.");
                                carrinho += (nescau * quantidade);
                                break;
                        }

                        System.out.println("Valor atual do carrinho: R$" + carrinho);

                    }

                // Sessão para funcionarios
                case 2:
                    while (produto != 4) {
                        // Entrada da senha do sistema
                        System.out.print("Por favor, informe a senha do sistema: ");
                        senha = inteiro.nextInt();
                        
                        if (senha == 1234) {
                            // Lista de produtos
                            System.out.println("Digite o valor que corresponde ao produto que terá seu preço alterado:");
                            System.out.print(" 1 -> Pamonha: R$" + pamonha + "\n 2 -> Agua: R$" + agua + "\n 3 -> Nescau: R$" + nescau + "\n 4 -> Parar\nEscolha: ");

                            produto = inteiro.nextInt();

                            // Casos para cada produto
                            switch (produto) {
                                case 1:
                                    System.out.print("Novo preço: ");
                                    preco = flutuante.nextFloat();
                                    System.out.println("Preço da Pamonha alterado com sucesso.");
                                    pamonha = preco;
                                    break;

                                case 2:
                                    System.out.print("Novo preço: ");
                                    preco = flutuante.nextFloat();
                                    System.out.println("Preço da Agua alterado com sucesso.");
                                    agua = preco;
                                    break;

                                case 3:
                                    System.out.print("Novo preço: ");
                                    preco = flutuante.nextFloat();
                                    System.out.println("Preço do Nescau alterado com sucesso.");
                                    nescau = preco;
                                    break;
                            }
                        }
                        
                        else {
                            System.out.println("Senha incorreta.");
                            break;
                        }
                    }

                // Fecha o programa
                case 3:
                    System.out.print("Deseja continuar no sistema?\n 1 -> Sim\n 2 -> Não\nEscolha: ");
                    rodando = inteiro.nextInt();
                    break;
            }
        }

        // Despedidas
        System.out.println("Agradecemos por confiar nos nossos serviços!");
    }
}
