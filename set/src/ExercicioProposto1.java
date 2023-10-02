import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        Set<String> arcoIris = new LinkedHashSet<>();
        arcoIris.add("vermelho");
        arcoIris.add("laranja");      
        arcoIris.add("amarelo");
        arcoIris.add("verde");
        arcoIris.add("azul");
        arcoIris.add("indigo");
        arcoIris.add("violeta");

        System.out.println("\nExiba todas as cores uma abaixo da outra:");
        for (String cor : arcoIris) {
            System.out.println(cor);
        }
        System.out.println("\nA quantidade de cores que o arco-íris tem: " + arcoIris.size());

        System.out.println("\nExiba as cores em ordem alfabética:");
        List<String> listArcoIris0 = new ArrayList<>(arcoIris);
        Collections.sort(listArcoIris0);
        System.out.println(listArcoIris0.toString());

        System.out.println("\nExiba as cores na ordem inversa da que foi informada:");
        List<String> listArcoIris1 = new ArrayList<>(arcoIris);
        Collections.reverse(listArcoIris1);
        System.out.println(listArcoIris1.toString());
        
        System.out.println("\nExiba todas as cores que começam com a letra v:");
        for (String cor : arcoIris) {
            if(cor.startsWith("v")){
                System.out.println(cor);
            }
        }

        System.out.println("\nRemova todas as cores que não começam com a letra v:");
        Set<String> arcoIris2 = new HashSet<>();
        arcoIris2.addAll(arcoIris);
        System.out.println("\nCores removidas");
        for (String cor : arcoIris) {
            if(!cor.startsWith("v")){
                System.out.println(cor);
                arcoIris2.remove(cor);
            }
        }
        System.out.println("\nCores restantes");
        System.out.println(arcoIris2.toString());
      
        System.out.println("\nLimpe o conjunto:");
        arcoIris.clear();
        System.out.println(arcoIris.toString());

        System.out.println("\nConfira se o conjunto está vazio: " +  arcoIris.isEmpty());
       
    }
}

