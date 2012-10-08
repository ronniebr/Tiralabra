/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronnie
 */
import java.util.*;

public class Kruskal {

    private Verkko verkko;
    private LinkedList[] solmutaulu = new LinkedList[5];
    private LinkedList<Solmu> vieruslista = new LinkedList();
    private LinkedList<Solmu> vieruslista2 = new LinkedList();
    private LinkedList<Solmu> vieruslista3 = new LinkedList();
    private LinkedList<Solmu> vieruslista4 = new LinkedList();
    private LinkedList<Solmu> vieruslista5 = new LinkedList();
    int[] pala;

    public Kruskal() {
    }

    public LinkedList[] virita(Verkko verkko) {
        this.verkko = verkko;
        Minimikeko minimikeko = new Minimikeko();
        pala = new int[verkko.getSolmutaulukko().length];
        for (int i = 0; i < verkko.getSolmutaulukko().length; i++) {
            pala[i] = i;




            for (int j = 0; j < verkko.getSolmutaulukko()[j].size(); j++) {
                Solmu solmu = (Solmu) verkko.getSolmutaulukko()[i].get(j);
                minimikeko.heapInsert(solmu.getSolmunNumero(), solmu.getKaaripaino());

            }
        }
        while(minimikeko.getHeapSize()!=0){
            minimikeko.heapDelMin();
        }






        return solmutaulu;

    }

    /*
     * private void vaihtoJarjesta(ArrayList<LinkedList> taulukko) {
     *
     * for (int i = 0; i < taulukko.size(); i++) { for (int j = i + 1; j <
     * taulukko.size(); j++) { solmu = (Solmu) taulukko.get(i).get(i); solmu2 =
     * (Solmu) taulukko.get(j).get(j); if (solmu.getKaaripaino() >
     * solmu2.getKaaripaino()) { } } } }
     *
     */
}
