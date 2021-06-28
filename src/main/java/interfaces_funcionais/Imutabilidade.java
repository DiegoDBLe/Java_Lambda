package interfaces_funcionais;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornaDobro = v-> v * 2; // Uma Lambda não deixa fazer alterações no valor da variavel ou seja tornando-se Imutavel
        System.out.println("Retorna o dobro do valor: " + retornaDobro.apply(valor));
        System.out.println("Valor não sera alterado: " + valor);

    }
}
