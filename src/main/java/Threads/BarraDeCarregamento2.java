package Threads;

public class BarraDeCarregamento2 implements Runnable{
    @Override
    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println("rodei BarraDeCarregamento2 : " );
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


