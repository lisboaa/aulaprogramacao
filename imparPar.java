import java.util.Scanner;

public class imparPar {
    public static void main(String[] args) {

        int[] vetor = new int[15];
        vetor[0] = 0;
        vetor[1] = 1;
        vetor[2] = 2;
        vetor[3] = 3;
        vetor[4] = 4;
        vetor[5] = 5;
        vetor[6] = 6;
        vetor[7] = 7;
        vetor[8] = 8;
        vetor[9] = 9;
        vetor[10] = 10;
        vetor[11] = 11;
        vetor[12] = 12;
        vetor[13] = 13;
        vetor[14] = 14;


        for(int listaDeNumeros : vetor) {
            if(listaDeNumeros % 2==0) {
                System.out.println("O numero " +listaDeNumeros +  " é Par!");
            } else {
                System.out.println("O numero " + listaDeNumeros + " é Impar!");
            }
        }
    }
}
