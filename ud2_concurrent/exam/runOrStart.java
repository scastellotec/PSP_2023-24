package ud2_concurrent.exam;

public class runOrStart implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        Thread th1 = new Thread(new runOrStart(), "t1");
        Thread th2 = new Thread(new runOrStart(), "t2");
        th1.start();
        th2.start();
    }
}