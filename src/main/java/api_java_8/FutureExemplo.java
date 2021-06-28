package api_java_8;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FutureExemplo {
    private static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {

        Casa casa = new Casa(new Quarto());
        List<? extends Future<?>> futuros = casa.obterAFazeresDaCasa()
                .stream().map(atividade -> pessoasParaExecutarAtividade.submit(atividade::realizar))
                .collect(Collectors.toList());//Future(submit) reference método ::


        pessoasParaExecutarAtividade.shutdown();




    }
}
