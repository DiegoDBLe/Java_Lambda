package Threads;

public class BarraDeCarregamento extends Thread{
    private Thread inicializarGeradorPDF;

    public BarraDeCarregamento(Thread inicializarGeradorPDF) {

        this.inicializarGeradorPDF = inicializarGeradorPDF;
    }

    @Override
    public void run() {

            try {
                while (true) {
                    Thread.sleep(500);

                    if (!inicializarGeradorPDF.isAlive()) {
                        break;
                    }
                    System.out.println("Loading...");

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
