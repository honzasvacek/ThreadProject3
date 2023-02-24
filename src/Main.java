public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*ThreadWriteA WriterA = new ThreadWriteA(6);
        Thread t = new ThreadWriteA(6);

        ThreadWriteNum WriterNum = new ThreadWriteNum(99);
        Thread x = new Thread(WriterNum);

        WriterA.start();
        x.start();*/

        VelkePole p = new VelkePole();

        System.out.println(p.secti());

        ThreadPrictiJedna Thread1 = new ThreadPrictiJedna(p);
        ThreadPrictiJedna Thread2 = new ThreadPrictiJedna(p);

        Thread1.start();
        //Thread.sleep(5); - první řešení
        //klíčové slovo synchronized, ktere vypiseme k metode zaruci ze jen jedno vlakno muze metodu zavolat a pouzit
        Thread2.start();

        System.out.println("Ohne Sheiđ!đ");

        //počká než vlákno skončí - v našem případě čeká na konce metody run
        Thread1.join();
        Thread2.join();

        System.out.println(p.secti());
    }
}