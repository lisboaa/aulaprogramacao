import java.util.Scanner;

public class exercicio1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.next();

        System.out.println("Primeira nota");
        Double nota1 = input.nextDouble();
        System.out.println("Segunda nota");
        Double nota2 = input.nextDouble();
        System.out.println("Terceira nota");
        double nota3 = input.nextDouble();

        double resultado = (nota1 + nota2 + nota3) / 3;

        if(resultado >= 70) {
            System.out.println(nome + " você está aprovado, parabéns!");
        } else if(resultado <= 50) {
            System.out.println(nome + " você está reprovado, estude um pouco mais!");
        } else if(resultado == 51 || resultado <= 69) {
            System.out.println(nome + " você está reprovado, estude um pouco mais!");
        }

    }
}
