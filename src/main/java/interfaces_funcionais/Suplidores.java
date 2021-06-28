package interfaces_funcionais;

import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa2 = Pessoa:: new; //Método de referencia
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());
    }
}


class Pessoa{
   private String nome;
   private Integer idade;

    public Pessoa() {
        this.nome = "Joao";
        this.idade = 23;
    }

    //Se nao implementar o metodo toString, quando mandar imprimir ele mostra o endereço de memoria
    @Override
    public String toString() {
        return String.format("nome: %s, Idade: %d",nome,idade);
    }
}