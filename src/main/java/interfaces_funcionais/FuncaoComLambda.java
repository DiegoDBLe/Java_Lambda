package interfaces_funcionais;

public class FuncaoComLambda {
    public static void main(String[] args) {
    Funcao colocarPrefixoNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoNaString.gerar("João"));
    }
}
