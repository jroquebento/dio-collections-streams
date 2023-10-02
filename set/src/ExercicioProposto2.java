import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        
        Set<LinguagemFavorita> linguagemFavoritas = new LinkedHashSet<>();
        linguagemFavoritas.add(new LinguagemFavorita("Java", 1995, "Eclipse"));
        linguagemFavoritas.add(new LinguagemFavorita("C#", 2000, "Visual Studio"));
        linguagemFavoritas.add(new LinguagemFavorita("Python", 1991, "PyCharm"));
      

        System.out.println("\nOrdem de Inserção");
        for (LinguagemFavorita linguagem : linguagemFavoritas) {
            System.out.println(linguagem);
        }
        
        System.out.println("\nOrdem Natural(nome)");
        Set<LinguagemFavorita> linguagemNome = new TreeSet<>();
        linguagemNome.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagem : linguagemNome) {
            System.out.println(linguagem);
        }

        System.out.println("\nIDE");
        Set<LinguagemFavorita> linguagemIDE = new TreeSet<>(new ComparatorIde());
        linguagemIDE.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagem : linguagemIDE) {
            System.out.println(linguagem);
        }

        System.out.println("\nAno de criação e nome");
        Set<LinguagemFavorita> linguagemAno = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        linguagemAno.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagem : linguagemAno) {
            System.out.println(linguagem);
        }

        System.out.println("\nNome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagemNomeAnoIde = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        linguagemNomeAnoIde.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagem : linguagemNomeAnoIde) {
            System.out.println(linguagem);
        }
    }       
}

class ComparatorIde implements Comparator<LinguagemFavorita>{
    
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.ide.compareToIgnoreCase(l2.ide);
    }
}

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita>{
    
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoDeCriacao = l1.anoDeCriacao.compareTo(l2.anoDeCriacao);
        if(anoDeCriacao != 0) return anoDeCriacao;

        return l1.nome.compareToIgnoreCase(l2.nome) ;
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{
    
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome =  l1.nome.compareToIgnoreCase(l2.nome);
        int anoDeCriacao = l1.anoDeCriacao.compareTo(l2.anoDeCriacao);
        if(nome != 0) return nome;
        if(anoDeCriacao != 0) return anoDeCriacao;
        
        return l1.ide.compareToIgnoreCase(l2.ide)  ;
    }
}