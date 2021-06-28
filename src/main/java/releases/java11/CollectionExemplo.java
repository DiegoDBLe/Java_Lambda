package releases.java11;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionExemplo {
    public static void main(String[] args) {
        //Assim
        List<String> nomes =  Arrays.asList("Diego", "Dantas","Batista");
        System.out.println(nomes);

        //Java 11 usando Collection e List.of
        Collection<String> nomes1=  List.of("Diego", "Dantas","Batista");
        System.out.println(nomes1);

        //Java 11 usando Collection e set.of (o set muda a ordem)
        Collection<String> nomes2=  Set.of("Diego", "Dantas","Batista");
        System.out.println(nomes2);
    }
}
