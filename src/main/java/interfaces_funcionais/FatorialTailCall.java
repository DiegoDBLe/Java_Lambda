package interfaces_funcionais;

public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }

    private static double fatorialA(double valor) {
        return fatorialTailCall(valor, 1);
    }

    private static double fatorialTailCall(double valor, double numero) {
        if (valor == 0) {
            return numero;
        }
        return fatorialTailCall(valor - 1, numero * valor);
    }
}
