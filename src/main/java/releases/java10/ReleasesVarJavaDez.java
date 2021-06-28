package releases.java10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class ReleasesVarJavaDez {
    public static void main(String[] args) {


        printarNome("Diego","Dantas");
        printarSoma(10,10);

    }

//    private static void connectAndPrintURLJavaOracle() throws IOException{
//        var url = new URL("https://docs.oracle.com/javase/10/language/");
//        var urlConnection = new openConnection();
//        var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));
//    }

    // var não pode ser utilizado a nivel de classe e nem como parameto
    public static void printarNome(String nome,String sobrenome){
        var nomeCompleto = String.format(nome + sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarSoma(int... numeros){
        int soma;
        if (numeros.length > 0){
            soma = 0;
            for(var numero : numeros){
                soma += numero;
            }
            System.out.println("A soma é :: " + soma);
        }



    }


//    private static class openConnection {
//
//        public InputStream getInputStream() {
//            return null;
//        }
//    }
}
