import java.util.Scanner;

public class exercicio2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiroValor = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        int segundoValor = input.nextInt();

        if(primeiroValor > segundoValor) {
            System.out.println("O primeiro valor digitado é maior que o segundo valor digitado");
        } else if (segundoValor > primeiroValor) {
            System.out.println("O segundo valor digitado é maior que o primeiro valor digitado");
        }
    }
}
