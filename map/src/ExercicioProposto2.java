import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Integer quantidadeLancamentos = 100;

<<<<<<< HEAD
=======

>>>>>>> 085003edf6401906910036cf442329fe41d35fd8
        Random numeroAleatorio = new Random();
        List<Integer> valores = new ArrayList<>();

        for(int i = 1; i <= quantidadeLancamentos; i++){
            valores.add(numeroAleatorio.nextInt(7));
        }

<<<<<<< HEAD
=======

>>>>>>> 085003edf6401906910036cf442329fe41d35fd8
        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if(lancamentos.containsKey(resultado)){
                lancamentos.put(resultado, lancamentos.get(resultado) + 1);
            }
            else{
                lancamentos.put(resultado, 1);
            }
        }
        
        System.out.println("\nValor " + " Quant. de vezes");
        for(Map.Entry<Integer, Integer> entry : lancamentos.entrySet()){
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
<<<<<<< HEAD
=======
        
>>>>>>> 085003edf6401906910036cf442329fe41d35fd8
    }
}
