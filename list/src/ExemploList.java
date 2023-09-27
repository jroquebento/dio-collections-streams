import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args){
        List<Double> notas =new ArrayList<>();

        // Método add adiciona um elemento na Lista
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println();
        System.out.println(notas.toString()); // toString transforma o objeto em uma String

        // indexOf retorna a posição do elemento na lista
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); 

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d); // add com dois parâmetros, valor + índice
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d),6.0); // set substitui um elemento da lista por outro 
        System.out.println(notas);

        // contains retorna se um elemento existe em uma lista
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println();
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }


        System.out.println();
        // get - recebe o índice e retorna o elemento na posição escolhida
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        //  .min() - menor valor
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // .max() - maior valor
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // cria um iterator e percorre a lista para somar os valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("\nExiba a soma dos valores: " + soma);

        // size - total de elementos na lista
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

       
        System.out.println("\nRemova a nota 0: ");
        // remove - exclui um elemento da lista
        notas.remove(0d); // d - número decimal
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista");

        // clear - remove todos os elementos da lista
        //notas.clear();
        System.out.println(notas);

        // isEmpty - verifica se a lista está vazia
        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());

        System.out.println();

        // Exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        List<Double> notas2 = new LinkedList<>();
        notas2.addAll(notas);
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println(notas2.get(0));
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista removendo-o: ");
        System.out.println(notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);
    }
}
