package api_java_8;

import java.util.Arrays;
import java.util.List;

//essa minha lista extende da classe comodo
public class Quarto extends Comodo{

    // Métodos da minha lista ou seja o que cada método faz.
    private void arrumarACama(){
        System.out.println("Arrumar a Cama: ");
    };
    private void arrumarOQuarto(){
        System.out.println("Arrumar o Quarto: ");
    };
    private void arrumarOGuardaRoupa(){
        System.out.println("Arrumar o Guarda Roupa: ");
    };

    //Implementação da minha lista Ou seja o Método da minha lista
    @Override
    List<Atividade> obterAfazerDoComodo() {
        return Arrays.asList(
                this::arrumarACama,
                this::arrumarOGuardaRoupa,
                this::arrumarOQuarto );
    }
}
