package Algoritmit;

import Tietorakenteet.Minimikeko;
import Tietorakenteet.Solmu;
import Tietorakenteet.Verkko;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Ronnie
 */
public class Prim {

    private int[] etaisyys;
    private int[] parent;
    private Verkko pieninVirittavaPuu;

    public Prim() {
    }

    /**
     * Virittää syötetyn verkon pienimmän virittävän puun ja palauttaa sen.
     * Läpikäynti alkaa aloitussolmusta.
     *
     * @param verkko
     * @param aloitussolmu
     * @return
     */
    public Verkko virita(Verkko verkko, int aloitussolmu) {



        etaisyys = new int[verkko.getVieruslista().length];
        parent = new int[verkko.getVieruslista().length];
        pieninVirittavaPuu = new Verkko(verkko.getVieruslista().length);
        Minimikeko minimikeko = new Minimikeko(verkko.getVieruslista().length);
        for (int i = 0; i < etaisyys.length; i++) {

            etaisyys[i] = 999;
            parent[i] = -1;
        }
        etaisyys[aloitussolmu] = 0;

        for (int i = 0; i < verkko.getVieruslista().length; i++) {

            minimikeko.heapInsert(i, etaisyys[i]);

        }
        while (minimikeko.getHeapSize() != 0) {
            int kasiteltavaSolmu = minimikeko.heapDelMin();
            int kaaripaino = 0;

            if (parent[kasiteltavaSolmu] != -1) {
                int k = 0;
                while (verkko.getVieruslista()[kasiteltavaSolmu][k] != null) {
                    Solmu vierussolmu = (Solmu) verkko.getVieruslista()[kasiteltavaSolmu][k];
                    if (vierussolmu.getSolmunNumero() == parent[kasiteltavaSolmu]) {
                        kaaripaino = vierussolmu.getKaaripaino();
                    }
                    k++;
                }
                pieninVirittavaPuu.lisaaKaari(kasiteltavaSolmu, parent[kasiteltavaSolmu], kaaripaino);
            }

            int i = 0;
            while (verkko.getVieruslista()[kasiteltavaSolmu][i] != null) {
                Solmu solmu = (Solmu) verkko.getVieruslista()[kasiteltavaSolmu][i];
                if (minimikeko.solmuOnKeossa(solmu.getSolmunNumero())
                        && solmu.getKaaripaino() < etaisyys[solmu.getSolmunNumero()]) {

                    parent[solmu.getSolmunNumero()] = kasiteltavaSolmu;
                    etaisyys[solmu.getSolmunNumero()] = solmu.getKaaripaino();
                    minimikeko.heapDecKey(solmu.getSolmunNumero(), etaisyys[solmu.getSolmunNumero()]);


                }
                i++;
            }

        }



        return pieninVirittavaPuu;
    }
}
