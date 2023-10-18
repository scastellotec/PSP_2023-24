package ud2_concurrent.exercise0;

public class main {
    public static void main(String[] args) {
        // Create and start Tac Thread
        Thread threadTac = new Thread(new GenericTicTac("Tac"));
        threadTac.start();
        // Create and start Tic Thread
        Thread threadTic = new Thread(new GenericTicTac("Tic"));
        threadTic.start();

        // It could be written in one line, but i won't be able to call join()
        //new Thread(new tic()).start();
    }
}
