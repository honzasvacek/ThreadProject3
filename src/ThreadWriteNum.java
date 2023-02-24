public class ThreadWriteNum implements Runnable{
    int max;

    public ThreadWriteNum(int max) {
        this.max = max;
    }

    public void run() {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }
}
