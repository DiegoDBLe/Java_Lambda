package Threads;

class GeradorPDF extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("Iniciar Geração de PDF ");
            Thread.sleep(5000);

        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}
