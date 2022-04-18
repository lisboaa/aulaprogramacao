import java.math.BigDecimal;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double nivel1 = 12.00;
        double nivel2 = 17.00;
        double nivel3 = 25.00;

        System.out.println("Informe o seu nivel profissional!");

        double nivelProfissional = input.nextDouble();

        if(nivelProfissional == 1) {
            System.out.println("Informe a quantidade de horas á trabalhar");
            double horasATrabalhar = input.nextDouble();
            BigDecimal resultado = BigDecimal.valueOf(nivel1 * horasATrabalhar);
            System.out.println("Seu salário como professor de nivel profissional " + Double.toString(nivelProfissional).replace(".0", " " ) + "trabalhando " + Double.toString(horasATrabalhar).replace(".0"," ") + "horas por dia " + "é: "+ "R$" +resultado.setScale(2) + " reais");
        } else if(nivelProfissional == 2) {
            System.out.println("Informe a quantidade de horas á trabalhar");
            double horasATrabalhar = input.nextDouble();
            BigDecimal resultado = BigDecimal.valueOf(nivel2 * horasATrabalhar);
            System.out.println("Seu salário como professor de nivel profissional " + Double.toString(nivelProfissional).replace(".0", " " ) + "trabalhando " + Double.toString(horasATrabalhar).replace(".0"," ") + "horas por dia " + "é: "+ "R$" +resultado.setScale(2) + " reais");
        } else if(nivelProfissional == 3) {
            System.out.println("Informe a quantidade de horas á trabalhar");
            double horasATrabalhar = input.nextDouble();
            BigDecimal resultado = BigDecimal.valueOf(nivel3 * horasATrabalhar);
            System.out.println("Seu salário como professor de nivel profissional " + Double.toString(nivelProfissional).replace(".0", " " ) + "trabalhando " + Double.toString(horasATrabalhar).replace(".0"," ") + "horas por dia " + "é: "+ "R$" +resultado.setScale(2) + " reais");
        }
    }
}
