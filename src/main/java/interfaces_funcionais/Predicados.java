package interfaces_funcionais;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
      // Predicate recebe como paramentro qualquer tipo e retorna Boolean
//    Predicate<String> estaVazio = valor -> valor.isEmpty();
//        System.out.println(estaVazio.test(""));
//        System.out.println(estaVazio.test("diego"));

       // ou da forma de metodo de reference
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("diego"));
    }
}
