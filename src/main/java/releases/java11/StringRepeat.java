package releases.java11;

public class StringRepeat {
    public static void main(String[] args) {
        //Repetir meu nome 10x
        String nome = "Diego,";
        String aux  = " ";

        for (int i = 0; i < 10; i++) {
            aux += nome;
        }
        System.out.println(aux);

        //Repetir meu nome 10x no Java 11 em apenas uma linha de código
        String nome1 ="Dantas, ";
        System.out.println(nome1.repeat(10));



    }
}
