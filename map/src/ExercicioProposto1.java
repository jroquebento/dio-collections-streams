import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("\nCrie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String,Integer> populacaoEstadosNE = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE);

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        populacaoEstadosNE.put("RN", 3534165);
        System.out.println(populacaoEstadosNE);

        System.out.println("\nConfira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
        "PB - 4.039.277: ");
        if(!populacaoEstadosNE.containsKey("PB") && !populacaoEstadosNE.containsValue(4039277)){
            populacaoEstadosNE.put("PB", 4039277);
        }
        System.out.println(populacaoEstadosNE);
       
        System.out.println("\nExiba a população do estado PE: ");
        for (Map.Entry<String,Integer> populacao : populacaoEstadosNE.entrySet()) {
            if(populacao.getKey() == "PE"){
                System.out.println(populacao.getKey() + " - População: " + populacao.getValue());
            }
        }
    
        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String,Integer> populacaoEstadosNE1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE1);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String,Integer> populacaoEstadosNE2 = new TreeMap<>(populacaoEstadosNE);
        System.out.println(populacaoEstadosNE2);

        System.out.printf("\nExiba o estado com o menor população e seu respectivo valor\n");
        Integer menorPopulacao = Collections.min(populacaoEstadosNE.values());
        for (Map.Entry<String,Integer> populacao : populacaoEstadosNE.entrySet()) {
            if(populacao.getValue().equals(menorPopulacao)){
                System.out.println(populacao.getKey() + " - População: " + populacao.getValue());
            }
            
        }

        System.out.printf("\nExiba o estado com a maior população e seu respectivo valor \n");
        Integer maiorPopulacao = Collections.max(populacaoEstadosNE.values());
        for (Map.Entry<String,Integer> populacao : populacaoEstadosNE.entrySet()) {
            if(populacao.getValue().equals(maiorPopulacao)){
                System.out.println(populacao.getKey() + " - População: " + populacao.getValue());
            }
        }
           
        Integer somaPopulacao = 0;
        for (Map.Entry<String,Integer> populacao : populacaoEstadosNE.entrySet()) {
            somaPopulacao += populacao.getValue();
        }
        System.out.println("\nExiba a soma da população desses estados: " + somaPopulacao);
        
        System.out.println("\nExiba a média da população deste dicionário de estados: " + somaPopulacao / populacaoEstadosNE.size());

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Map<String,Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE);
        Iterator<Integer> iterator = populacaoEstadosNE3.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next() < 4000000){
                iterator.remove();
            }
        }
        System.out.println(populacaoEstadosNE3);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadosNE3.clear();
        System.out.println(populacaoEstadosNE3);

        System.out.println("\nConfira se a lista está vazia: " + populacaoEstadosNE.isEmpty());

        System.out.println("\n-----------------");
        System.out.println("Fim do Programa");
    }
}
