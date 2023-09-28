import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};

        System.out.println();

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println();
        System.out.println("--\tOrdem aleatório\t---");
        // shuffle - embaralha os elementos
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem alfabética\t---");
        // sort - ordena os elementos na condição solicitada
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        
    }
}
