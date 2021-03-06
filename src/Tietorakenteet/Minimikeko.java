package Tietorakenteet;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Ronnie
 */
public class Minimikeko {

    private int[] Keko;
    private Kaari[] Keko2;
    private int[] Solmut;
    private int[][] Kaaret;
    private int heapSize = 0;

    public Minimikeko() {
    }

    /**
     * Luo minimikeon kekoon tulevien alkioiden lukumäärän perusteella ja
     * alustaa kekotaulukon Keko[} sekä aputaulukon Solmut[] ja matriisin
     * Kaaret[][].
     *
     * @param alkioidenlkm
     */
    public Minimikeko(int alkioidenlkm) {

        Solmut = new int[alkioidenlkm];
        Keko = new int[alkioidenlkm + 1];
        Keko2 = new Kaari[alkioidenlkm*alkioidenlkm+1];
        Kaaret = new int[alkioidenlkm][alkioidenlkm];

        for (int j = 0; j < Keko.length; j++) {
            Keko[j] = 999;

        }
        for (int j = 0; j < Solmut.length; j++) {

            Solmut[j] = 999;
        }


    }

    /**
     * Lisää kekoon Solmun ja siihen liittyvän avaimen. Primin käyttämä metodi.
     *
     * @param solmunumero
     * @param k
     */
    public void heapInsert(int solmunumero, int k) {
        heapSize += 1;
        int i = heapSize;

        while (i > 1 && parent(i) > k) {
            Keko[i] = parent(i);
            i = i / 2;
        }
        Keko[i] = k;
        Solmut[solmunumero] = k;





    }

    /**
     * Lisää kekoon verkon kaaren (u,v) kaaripainolla k. Kruskalin käyttämä
     * metodi.
     * HUOM! ei käytössä, koska erittäin hidas. Korvattu metodilla heapDelMinK2(), joka ei käytä apurakenteita.
     *
     * @param u
     * @param v
     * @param k
     */
    public void heapInsert(int u, int v, int k) {
        if (Kaaret[v][u] == k) {
            return;
        }
        heapSize += 1;
        int i = heapSize;

        while (i > 1 && parent(i) > k) {
            Keko[i] = parent(i);
            i = i / 2;
        }
        Keko[i] = k;
        Kaaret[u][v] = k;
    }
/**
 * Lisää kekoon verkon kaaren (u,v) kaaripainolla k. Kruskalin käyttämä
 * metodi.
 * Korvaa vanhan heapInsert(u,v,k) metodin, huomattavasti nopeampi ja toimii isommalla syötteellä.
 * @param u
 * @param v
 * @param k 
 */
    public void heapInsert2(int u, int v, int k) {

        heapSize += 1;
        int i = heapSize;
        while (i > 1 && parent2(i).getKaaripaino() > k) {
            Keko2[i] = parent2(i);
            i = i / 2;
        }
        Keko2[i] = new Kaari(u, v, k);


    }

    /**
     * Palauttaa keon pienimmän alkion;
     *
     * @return
     */
    public int heapMin() {
        return Keko[1];

    }

    /**
     * Poistaa keon pienimmän alkion ja palauttaa siihen liittyvän solmun
     * numeron. Primin käyttämä metodi.
     *
     * @return
     */
    public int heapDelMin() {
        int min = Keko[1];
        int solmuindeksi = -1;
        Keko[1] = Keko[heapSize];
        heapSize -= 1;

        heapify(1);

        for (int i = 0; i < Solmut.length; i++) {

            if (Solmut[i] == min) {
                solmuindeksi = i;
                Solmut[i] = 998;
                break;
            }

        }

        return solmuindeksi;



    }

    /**
     * Poistaa keon pienimmän alkion ja palauttaa siihen liittyvän kaaren (u,v).
     * Kruskalin käyttämä metodi.
     * HUOM! ei käytössä, koska erittäin hidas. Korvattu metodilla heapDelMinK2(), joka ei käytä apurakenteita.
     * @return kaari
     */
    public Kaari heapDelMinK() {
        int min = Keko[1];
        int lahtosolmu = -1;
        int loppusolmu = -1;
        Kaari pieninKaari;
        Keko[1] = Keko[heapSize];
        heapSize -= 1;

        heapify(1);

        for (int u = 0; u < Kaaret.length; u++) {
            for (int v = 0; v < Kaaret[u].length; v++) {
                if (Kaaret[u][v] == min) {

                    lahtosolmu = u;
                    loppusolmu = v;
                    Kaaret[u][v] = 998;

                    break;
                }

            }
        }
        return pieninKaari = new Kaari(lahtosolmu, loppusolmu, min);
    }
/**
 * Poistaa keon pienimmän kaaren ja palauttaa sen.
 * Vanhan heapDelMinK() metodin korvaaja, huomattavasti nopeampi ja toimii isommalla syötteellä.
 * @return kaari
 */
    public Kaari heapDelMinK2() {
        Kaari pieninKaari = Keko2[1];
        Keko2[1] = Keko2[heapSize];
        heapSize -= 1;

        heapify2(1);

        return pieninKaari;
    }

    /**
     * Pienentää annettun solmun avaimen arvoa.
     *
     * @param solmu
     * @param uusiAvain
     */
    public void heapDecKey(int solmu, int uusiAvain) {

        int apu;
        int i = -1;
        int apu2 = Solmut[solmu];
        for (int j = 1; j <= heapSize; j++) {

            if (Keko[j] == apu2) {
                i = j;
            }
        }
        if (uusiAvain < Keko[i]) {

            Keko[i] = uusiAvain;
            Solmut[solmu] = uusiAvain;
            while (i > 1 && parent(i) > Keko[i]) {

                apu = Keko[i];
                Keko[i] = parent(i);
                Keko[i / 2] = apu;
                i = i / 2;
            }
        }
    }

    /**
     * Palauttaa keon koon.
     *
     * @return
     */
    public int getHeapSize() {
        return heapSize;
    }

    /**
     * Tarkistaa onko syötetty solmu keossa.
     *
     * @param solmu
     * @return boolean
     */
    public boolean solmuOnKeossa(int solmu) {

        if (Solmut[solmu] == 998) {
            return false;
        } else {
            return true;
        }


    }

    /**
     * Korjaa annetun keon indeksin kekoehdon.
     *
     * @param i
     */
    private void heapify(int i) {
        int pienin;
        int apu;
        int l = 2 * i;
        int r = 2 * i + 1;

        if (heapSize == 2) {

            if (Keko[1] > Keko[2]) {
                apu = Keko[1];
                Keko[1] = Keko[2];
                Keko[2] = apu;

            }


        } else if (r <= heapSize) {
            if (Keko[l] < Keko[r]) {
                pienin = l;
            } else {
                pienin = r;
            }
            if (Keko[i] > Keko[pienin]) {

                apu = Keko[i];
                Keko[i] = Keko[pienin];
                Keko[pienin] = apu;
                heapify(pienin);
            }
        } else if (l == heapSize && Keko[i] < Keko[l]) {
            apu = Keko[i];
            Keko[i] = Keko[l];
            Keko[l] = apu;

        }

    }
/**
 * Korjaa annetun keon indeksin kekoehdon.
 * Uusi Kruskalin käyttämä metodi, joka ymmärtää Kaariolioita.
 * @param i 
 */
    private void heapify2(int i) {
        int pienin;
        Kaari apu;
        int l = 2 * i;
        int r = 2 * i + 1;

        if (heapSize == 2) {

            if (Keko2[1].getKaaripaino() > Keko2[2].getKaaripaino()) {
                apu = Keko2[1];
                Keko2[1] = Keko2[2];
                Keko2[2] = apu;

            }


        } else if (r <= heapSize) {
            if (Keko2[l].getKaaripaino() < Keko2[r].getKaaripaino()) {
                pienin = l;
            } else {
                pienin = r;
            }
            if (Keko2[i].getKaaripaino() > Keko2[pienin].getKaaripaino()) {

                apu = Keko2[i];
                Keko2[i] = Keko2[pienin];
                Keko2[pienin] = apu;
                heapify2(pienin);
            }
        } else if (l == heapSize && Keko2[i].getKaaripaino() < Keko2[l].getKaaripaino()) {
            apu = Keko2[i];
            Keko2[i] = Keko2[l];
            Keko2[l] = apu;

        }

    }

    /**
     * Palauttaa annetun indeksin vanhemman alkion.
     *
     * @param i
     * @return
     */
    private int parent(int i) {

        return Keko[i / 2];
    }

    private Kaari parent2(int i) {
        return Keko2[i / 2];
    }

    /**
     * Palauttaa annetun indeksin vasemman lapsen alkion.
     *
     * @param i
     * @return
     */
    private int left(int i) {
        return Keko[2 * i];
    }

    /**
     * Palauttaa annetun indeksin oikean lapsen alkion.
     *
     * @param i
     * @return
     */
    private int right(int i) {
        return Keko[2 * i + 1];
    }

    @Override
    public String toString() {
        for (int j = 0; j <= heapSize; j++) {
            System.out.print(Keko[j]);
            System.out.print(",");
        }
        System.out.println();
        return ".";
    }
}
