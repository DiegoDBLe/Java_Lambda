package interfaces_funcionais;

import java.util.function.UnaryOperator;

public class ParadgmaFuncional {
    public static void main(String[] args) {
        // Paradgma funcional declaro o comportamento dele antes de usa-lo. valor -> valor * 3.
        UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 3;
        int valor = 10;
        System.out.println("O Resultado é : " + calcularValorVezesTrinta.apply(10));
    }
}
