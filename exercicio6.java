import java.util.ArrayList;
import java.util.List;

public class exercicio6 {

    public static void main(String args[]) {

        List listaDeProdutos = new ArrayList();

        listaDeProdutos.add("Manteiga");
        listaDeProdutos.add("Café");
        listaDeProdutos.add("Leite");
        listaDeProdutos.add("Pao");
        //for off
        for(Object lista : listaDeProdutos) {
            System.out.println(lista);
        }

    }
}
