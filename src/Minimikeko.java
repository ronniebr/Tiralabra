/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronnie
 */
public class Minimikeko {

    private int[] A = new int[10];
    
    private int[] Solmut;
    private int heapSize = 0;

    public Minimikeko() {
        for (int j = 0; j < A.length; j++) {
            A[j] = 999;
            Solmut[j] = 999;
        }
    }

    public Minimikeko(int solmulkm) {

        Solmut = new int[solmulkm];
        A = new int[solmulkm + 1];

        for (int j = 0; j < A.length; j++) {
            A[j] = 999;
           
        }
        for (int j = 0; j < Solmut.length; j++) {

            Solmut[j] = 999;
        }

    }
    /*

    public void heapInsert(int k) {
        heapSize += 1;
        int i = heapSize;

        while (i > 1 && parent(i) > k) {
            A[i] = parent(i);
            i = i / 2;
        }
        A[i] = k;







    }
    **/

    public void heapInsert(int solmu, int k) {
        heapSize += 1;
        int i = heapSize;

        while (i > 1 && parent(i) > k) {
            A[i] = parent(i);
            i = i / 2;
        }
        A[i] = k;
        Solmut[solmu] = k;

        /*
         for( i=0;i<Solmut.length;i++){
         System.out.print(Solmut[i]+",");
        
         }
         System.out.println();
        
         * 
         */




    }

    public int heapMin() {
        return A[1];

    }

    public int heapDelMin() {
        int min = A[1];
        int solmuindeksi = -1;
        A[1] = A[heapSize];
        heapSize -= 1;
        //System.out.println(A[1]);
        heapify(1);
        // return min;
        for (int i = 0; i < Solmut.length; i++) {
            //System.out.println(Solmut[i]);
            if (Solmut[i] == min) {
                solmuindeksi = i;
                Solmut[i] = 99;
                break;
            }

        }

        return solmuindeksi;



    }
    /*
     public void heapDecKey(int i, int uusiAvain) {//ei vielä toimi solmuille
     int apu;
     if (uusiAvain < A[i]) {
     A[i] = uusiAvain;
     while (i > 1 && parent(i) > A[i]) {

     apu = A[i];
     A[i] = parent(i);
     A[i / 2] = apu;
     i = i / 2;
     }

     }
     }
     * 
     */

    public void heapDecKey(int solmu, int uusiAvain) {
        int apu;
        int i = -1;
        int k;
        int apu2 = Solmut[solmu];
/*
        System.out.println("Solmut ennen: ");
        for (k = 0; k < Solmut.length; k++) {
            System.out.print(Solmut[k] + ",");

        }
        System.out.println();

        //Solmut[solmu] = uusiAvain;
        //System.out.println("apu2: " + apu2);
        * */
        
        for (int j = 1; j <= heapSize; j++) {
            // System.out.println(A[j]);
            if (A[j] == apu2) {
                i = j;

            }
        }

        if (uusiAvain < A[i]) {
            A[i] = uusiAvain;
            Solmut[solmu] = uusiAvain;

            while (i > 1 && parent(i) > A[i]) {

                apu = A[i];
                A[i] = parent(i);
                A[i / 2] = apu;
                i = i / 2;
            }

        }
        /*
        System.out.println("Solmut jälkeen: ");
        for (k = 0; k < Solmut.length; k++) {
            System.out.print(Solmut[k] + ",");

        }
        System.out.println();
        **/

    }

    public int getHeapSize() {
        return heapSize;
    }

    public boolean solmuOnKeossa(int solmu) {

        if (Solmut[solmu] == 99) {
            return false;
        } else {
            return true;
        }


    }

    private void heapify(int i) {
        int pienin;
        int apu;
        int l = 2 * i;
        int r = 2 * i + 1;
        if (r <= heapSize) {
            if (A[l] < A[r]) {
                pienin = l;
            } else {
                pienin = r;
            }
            if (A[i] > A[pienin]) {

                apu = A[i];
                A[i] = A[pienin];
                A[pienin] = apu;
                heapify(pienin);
            }
        } else if (l == heapSize && A[i] < A[l]) {
            apu = A[i];
            A[i] = A[l];
            A[l] = apu;

        }

    }

    private int parent(int i) {

        return A[i / 2];
    }

    private int left(int i) {
        return A[2 * i];
    }

    private int right(int i) {
        return A[2 * i + 1];
    }

    @Override
    public String toString() {
        for (int j = 0; j < A.length; j++) {
            System.out.print(A[j]);
            System.out.print(",");
        }
        System.out.println();
        return ".";
    }
}
