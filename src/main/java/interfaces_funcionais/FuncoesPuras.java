package interfaces_funcionais;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        // Nas funções puras todas vez que eu passar o mesmo parametro pra ela tem que me retorar p mesmo valor.
        BiPredicate<Integer, Integer> verificarSeEMaior = (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEMaior.test(13,12));
        System.out.println(verificarSeEMaior.test(13,12));
    }
}
