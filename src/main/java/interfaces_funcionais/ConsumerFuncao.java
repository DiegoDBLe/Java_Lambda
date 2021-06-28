package interfaces_funcionais;

import java.util.function.Consumer;

public class ConsumerFuncao {
    public static void main(String[] args) {
    //Método de referencia

        Consumer<String> imprimindoUmaFrase = System.out::println;
        imprimindoUmaFrase.accept("Hello World");

//        Consumer<String> imprimindoUmaFrase = frase -> System.out.println(frase);
//        imprimindoUmaFrase.accept("Hello World"); //Método accept vem do consumer
    }
}
