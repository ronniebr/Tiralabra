/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronnie
 */


public class Kruskal {

    private Verkko verkko;
    private Solmu[][] solmutaulu;

    int[] pala;

    public Kruskal() {
    }

    public Solmu[][] virita(Verkko verkko) {
        this.verkko = verkko;
        Minimikeko minimikeko = new Minimikeko();
        pala = new int[verkko.getVieruslista().length];
        for (int i = 0; i < verkko.getVieruslista().length; i++) {
            pala[i] = i;




            for (int j = 0; j < verkko.getVieruslista()[j].length; j++) {
                Solmu solmu = (Solmu) verkko.getVieruslista()[i][j];
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
