
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double preco, desconto;
        char categoria;

        System.out.println("Digite o nome do cliente: ");
        nome = scanner.nextLine();
        System.out.println("Digite o preço: ");
        preco = scanner.nextDouble();
        System.out.println("Digite a categoria: ");
        categoria = scanner.next().charAt(0);

        switch (categoria) {
            case 'A':
                desconto = 0.1;
                break;
            case 'B':
                desconto = 0.15;
                break;
            case 'C':
                desconto = 0.2;
                break;
            case 'D':
                desconto = 0.25;
                break;
            case 'E':
                desconto = 0.5;
                break;
            default:
                desconto = 0;
                System.out.println("Opção Inválida.");
                break;
        }
        if (desconto != 0) {
            System.out.printf("Valor total a ser pago: R$%.2f%n", preco - (preco * desconto));
        } else {
            System.out.println("Valor total a ser pago: R$" + preco);
        }
    }
}
