package Threads;

public class ThreadsExemplos {
    public static void main(String[] args) {
     GeradorPDF inicializarGeradorPDF = new GeradorPDF();
     BarraDeCarregamento inicializarBarraDeCarregamento = new BarraDeCarregamento(inicializarGeradorPDF);

     inicializarGeradorPDF.start();
     inicializarBarraDeCarregamento.start();

 }
}


class BarraDeCarregamento3 implements Runnable{
    @Override
    public void run() {


        try {
            Thread.sleep(5000);
            System.out.println("rodei BarraDeCarregamento3 :  " );
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
