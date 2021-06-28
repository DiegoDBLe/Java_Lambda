package interfaces_funcionais;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a + b; // Como se fosse o corpo do método soma
        Calculo sub = (a,b) ->  a - b;
        Calculo divi = (a,b) -> a / b;
        Calculo mult = (a,b) -> a * b;

        System.out.println("soma: " + executarOperacao(soma,1,3));
        System.out.println("sub: " + executarOperacao(sub,4,3));
        System.out.println("divi: " + executarOperacao(divi,4,2));
        System.out.println("mult:" + executarOperacao(mult,7,3)); //O método executarOperacao recebe como parâmetro o comportamento de
        // soma, que recebe os paramentros do seu próprio comportamento.
    }

    // Esse método ta funcionando como uma função de alta ordem porque está recebendo outra Função como paramentro, nesse caso, Calculo
    public static int executarOperacao(Calculo calculo, int a , int b){
        return calculo.Calcular(a,b);
    }
}

 interface Calculo {
    public int Calcular (int a, int b);
}

