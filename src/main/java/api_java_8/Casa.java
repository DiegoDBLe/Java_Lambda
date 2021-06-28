package api_java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Casa {
    private List<Comodo> comodos;

    Casa(Comodo...comodos){
        this.comodos = Arrays.asList(comodos);}

        List<Atividade> obterAFazeresDaCasa(){
         return  this.comodos.stream().map(Comodo::obterAfazerDoComodo)
                 .reduce(new ArrayList<Atividade>(),(atividades, atividades2) -> {
                     atividades.addAll(atividades2);
                     return atividades;
                 });
    };
}
