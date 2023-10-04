import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\nImprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);
        
        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet())
            .forEach(System.out::println);

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
        numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList())
            .forEach(System.out::println);

        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> paresMaioresQue2 = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .filter(i -> i % 2 == 0 && i > 2)
            .collect(Collectors.toList());
        System.out.println(paresMaioresQue2);

        System.out.println("\nMostre a média dos números: ");
        numerosAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);
        
        System.out.println("\nRemova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger =  numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        
        numerosAleatoriosInteger.removeIf(i -> (i % 2 !=0));
        System.out.println(numerosAleatoriosInteger);
    } 
}
