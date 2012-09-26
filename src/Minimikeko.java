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
    private int heapSize = 0;

    public Minimikeko() {
        for (int j = 0; j < A.length; j++) {
            A[j] = 99;
        }
    }

    public void heapInsert(int k) {
        heapSize += 1;
        int i = heapSize;

        while (i > 1 && parent(i) > k) {
            A[i] = parent(i);
            i = i / 2;
        }
        A[i] = k;




    }

    public int heapMin() {
        return A[1];

    }

    public int heapDelMin() {
        int min = A[1];
        A[1] = A[heapSize];
        heapSize -= 1;
        System.out.println(A[1]);
        heapify(1);
        return min;


    }

    public void heapDecKey(int i, int uusiAvain) {
        int apu;
        if (uusiAvain < A[i]) {
            A[i] = uusiAvain;
            while(i>1 && parent(i) > A[i]){
                
                apu = A[i];
                A[i] = parent(i);
                A[i/2] = apu;
                i = i/2;
            }
            
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
