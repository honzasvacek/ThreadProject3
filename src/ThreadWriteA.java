public class ThreadWriteA extends Thread{
    int max;

    public ThreadWriteA(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.println("A");

        }
    }
}
