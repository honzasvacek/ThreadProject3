public class VelkePole {
    int[] arr;

    public VelkePole() {
        this.arr = new int[1000000];
    }

    public int delkaPole() {
        return arr.length;
    }

    public synchronized void prictiJedna(int index) {
        //nesmí oba dva číst a zapisovat 
        arr[index] ++;
    }

    public int secti(){
        int soucet = 0;
        for (int i:arr) {
            soucet += i;
        }
        return soucet;
    }
}


