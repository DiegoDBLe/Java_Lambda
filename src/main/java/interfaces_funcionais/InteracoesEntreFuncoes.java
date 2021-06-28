package interfaces_funcionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InteracoesEntreFuncoes {
    public static void main(String[] args) {
        String[] nomes = {"Joao", "Paulo","Oliveira","Santos","Instrutor","Java"};
        Integer[] numeros = {1,2,3,4,5};

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de Projeto");
        profissoes.add("Gerente de Qualidade");

        //Adicionado em uma Stream
        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente")) //Filtrando por Gerente
                .forEach(System.out::println);


        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Joao"))
                .collect(Collectors.joining()); // Método joining pega um array de String e transforma tudo em uma String
        System.out.println("Nomes do Stream: " + nomesParaImprimirDaStream);

        // Como era feito antes do Java 8
//        public static void imprimirNomesFiltrados(String[]nomes){
//
//           String nomesParaImprimir = "";
//            for (int i = 0; i < nomes.length; i++){
//                if(nomes[i].equals("Joao")){
//                    nomesParaImprimir += "" + nomes[1];
//                }
//            }
//        }

        // Mostrar todos os nomes do Array -
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimindo pelo ForEach " + nome));
                // OU assim:     forEach(System.out::println);

        // Mostrar todos os nomes do Array - Como era feito antes do Java 8
//        public static void imprimirTodosOsNomes(String[],nomes){
//            for (String nome : nomes){
//                System.out.println(nome);
//            }
//        }

        // // Mostrar todos os numeros do Array  e multiplicar por 2
        Stream.of(numeros).map(numero -> numero * 2)
                .forEach(System.out::println);




        // Mostrar todos os numeros do Array  e multiplicar por 2- Como era feito antes do Java 8
//        public static void imprimirODobroDeCadaItemDaLista(Integer[] numeros){
//            for (Integer numero : numeros){
//                System.out.println(numero * 2);
//            }
//
//        }



    }
}
