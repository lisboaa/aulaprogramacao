import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class loopin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] listaDeNomes = new String[5];
        listaDeNomes[0] = "Douglas";
        listaDeNomes[1] = "Lisboa";
        listaDeNomes[3] = "Fernando";
        listaDeNomes[4] = "Souza";


        System.out.println("Informe seu nome: ");
        String nome  = input.next();
        for(int i =0; i < listaDeNomes.length; i++) {
            if(listaDeNomes[i].equals(nome)) {
                System.out.println("Sua posição na matriz é:" + i);
                break;
            } else {
                System.out.println("O " + nome + " não foi econtrado na posição "+ i);
            }
        }
        input.close();

    }


}
