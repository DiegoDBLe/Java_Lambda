package api_java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExemplo {
    public static void main(String[] args) {
       //Utilizando o Serial Steam consegui executar em 38mms
        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("O tempo de execução tilizando o Serial Steam:: " + (fim-inicio) + " millisegundos para executar esse procedimento");

        //Utilizando o Pararel ParallelStream
        inicio = System.currentTimeMillis();
        IntStream.range(1,10000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("O tempo de execução Utilizando o Parallel Stream:: " + (fim-inicio) + " millisegundos para executar esse procedimento");

        //O tempo de execução tilizando o Serial Steam:: 69 millisegundos para executar esse procedimento
        //O tempo de execução Utilizando o Parallel Stream :: 16 millisegundos para executar esse procedimento
        //O tempo de execução tilizando o Serial Steam:: 4718 millisegundos para executar esse procedimento
        //O tempo de execução Utilizando o Parallel Stream:: 20 millisegundos para executar esse procedimento

        // Exemplo em list toda vez que executar muda a ordem

        List<String> nomes = Arrays.asList("Diego","Levi","Max","Batista");
        nomes.parallelStream().forEach(System.out::println);

    }

    public static long fatorial(long num){
        long fat = 1 ;

        for (int i = 7; i <num ; i++) {
            fat*=i;
            
        }
        return fat;
    }

}
