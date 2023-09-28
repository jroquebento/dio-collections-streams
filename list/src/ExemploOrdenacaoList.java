import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};

        System.out.println("\n--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println();
        System.out.println("\n--\tOrdem aleatório\t---");
        // shuffle - embaralha os elementos
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem alfabética\t---");
        // sort - ordena os elementos na condição solicitada
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        
        System.out.println("\n--\tOrdem idade\t---");   
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem cor\t---");   
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem Nome/Cor/Idade\t---");  
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}
