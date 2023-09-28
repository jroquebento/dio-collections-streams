import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>();
        List<String> respostas = new ArrayList<>();
        String resposta = "";

        perguntas.add("Telefonou para a vítima? ");
        perguntas.add("Esteve no local do crime? ");
        perguntas.add("Mora perto da vítima? ");
        perguntas.add("Devia para a vítima? ");
        perguntas.add("Já trabalhou com a vítima? ");

        Integer respostaPositiva = 0;
        System.out.println();
        for (String pergunta : perguntas) {
            System.out.print(pergunta + "(s/n):");
            resposta = sc.next();
            respostas.add(resposta);
            if(resposta.equalsIgnoreCase("s")){
                respostaPositiva++;
            }
        }
                
        System.out.println();
        switch (respostaPositiva) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;

            default:
                System.out.println("Inocente");
                break;
        }
        sc.close();
    }
}
