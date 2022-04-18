import java.util.Scanner;

public class exercicio4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");

        int primeiroValor = input.nextInt();
        int segundoValor = input.nextInt();
        int diferenca = primeiroValor - segundoValor;

        System.out.println("A diferença entre o primeiro valor e o segundo é: " + diferenca);

    }
}
