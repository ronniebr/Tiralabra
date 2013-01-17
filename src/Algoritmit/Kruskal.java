package Algoritmit;

import Tietorakenteet.Kaari;
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
public class Kruskal {

    private Verkko pieninVirittavaPuu;
    int[] pala;

    public Kruskal() {
    }

    /**
     * Metodi virittää syötetyn verkon pienimmän puun ja palauttaa sen.
     *
     * @param verkko
     * @return
     */
    public Verkko virita(Verkko verkko) {

        pieninVirittavaPuu = new Verkko(verkko.getVieruslista().length);
        Minimikeko minimikeko = new Minimikeko(verkko.getVieruslista().length);
        pala = new int[verkko.getVieruslista().length];

        for (int i = 0; i < verkko.getVieruslista().length; i++) {

            pala[i] = i;
            int j = 0;
            while (verkko.getVieruslista()[i][j] != null) {
                Solmu solmu = (Solmu) verkko.getVieruslista()[i][j];

                minimikeko.heapInsert2(i, solmu.getSolmunNumero(), solmu.getKaaripaino());
                j++;
            }
        }
        while (minimikeko.getHeapSize() != 0) {

            Kaari kaari;
            kaari = minimikeko.heapDelMinK2();


            if (pala[kaari.getV()] != pala[kaari.getU()]) {
                pieninVirittavaPuu.lisaaKaari(kaari.getU(), kaari.getV(), kaari.getKaaripaino());
                pala[kaari.getU()] = -1;
                pala[kaari.getV()] = -1;
            }
        }

        return pieninVirittavaPuu;

    }
}
