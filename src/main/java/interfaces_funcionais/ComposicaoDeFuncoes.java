package interfaces_funcionais;

import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        int [] valores = {1,2,3,4};
        //Paradgma Funcional - Fica um código mais limpo e mais facil de dar manutenção
        Arrays.stream(valores)
            .filter(numero -> numero %2 == 0) // Para cada numero que entrar aqui verifica se o resto da divisão dividido por 2 é igual a 0. Se for
            .map(numero -> numero * 2) // Mjltiplica ele por *2
            .forEach(numero -> System.out.println(numero));// se tudo tiver ok printa o valor

        // Essa parte de cima é a mesma coisa do for escrito embaixo

        //Paradgma Imperativo
//        for(int i = 0; i < valores.length; i++) {
//            int valor = 0;
//              if(valores[i] %2 == 0 ){
//                  valor = valores[i] * 2;
//
//                  if(valor !=0){
//                      System.out.println(valor);
//                  }
//              }
//        }

    }

}
