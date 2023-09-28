import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioProposto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> temperaturasMedias = new ArrayList<>();  

        Double temperatura;
        Double somaTemperatura = 0.0;
        Double mediaSemestral = 0.0;
        System.out.println();
        for(int i = 1; i <= 6; i++){
            System.out.print("Digite a " + i + " temperatura média: ");
            temperatura = sc.nextDouble();
            temperaturasMedias.add(temperatura);
            somaTemperatura += temperatura;
            if(i == 6){
                mediaSemestral = somaTemperatura / 6;
            }
        }
        System.out.println();
        Integer index = 1;
        System.out.printf("Média Semestral Temperaturas: %.2f\n\n", mediaSemestral);       
        for (Double temperaturaMedia : temperaturasMedias) {
            if(temperaturaMedia > mediaSemestral){
                System.out.println(escolherMes(index)+ "\nTemperatura: " + temperaturaMedia);
                System.out.println();
            }
            index++;
        }
       
        sc.close();
    }
    public static String escolherMes(Integer index){
        String mes = "";
        switch (index) {
            case 1:
                mes = "1 - Janeiro";
                break;
            case 2:
                mes = "2 - Fevereiro";
                break;
            case 3:
                mes = "3 - Março";
                break;
            case 4:
                mes = "4 - Abril";
                break;
            case 5:
                mes = "5 - Maio";
                break;
            case 6:
                mes = "6 - Junho";
                break;
                
            default:
                break;
        }        
        return mes;
    }
}
