package releases.java11;

public class StringIsBlankExemplo {
    public static void main(String[] args) {
          String espaco = "                                   ";
        System.out.println(espaco == null || espaco.length() == 0 || espaco.chars().allMatch( c -> c == ' ')); // retorno boolean
        // Validação para saber se é Blank ou não. Saber se a String está vazia.Coloca esse codigo em um método
        // Só que no java11 ja tem esse método isBlank

        System.out.println(espaco.isBlank());
    }
}
