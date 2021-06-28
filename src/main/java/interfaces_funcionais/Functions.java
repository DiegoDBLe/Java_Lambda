package interfaces_funcionais;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        //As Functions recebem parâmetros e tem que responder com parâmetros tambem. Nesse caso recebeu String retorna String
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNomeAoContrario.apply("ana"));

        //As Functions recebem parâmetros e tem que responder com parâmetros tambem. Nesse caso recebeu String retorna Integer multipliquei por 2 para
        // ter certeza que deu certo.
        Function<String, Integer> converterDeStringParaInteger = string -> Integer.valueOf(string) * 2;
        System.out.println(converterDeStringParaInteger.apply("20"));

        // Mesma sintaxe do codigo de cima. Porem convertezando usando parseInte(string)
        Function<String, Integer> converterDeStringParaInteger1 = string -> Integer.parseInt(string) * 2;
        System.out.println(converterDeStringParaInteger.apply("30"));


    }
}
