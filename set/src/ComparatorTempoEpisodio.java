import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int tempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        if(tempoEpisodio != 0)
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        return 0;
    }
    
}
