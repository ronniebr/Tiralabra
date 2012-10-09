
import java.util.*;

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
    private LinkedList[] pieninVirittavaPuu;


    public Prim() {
    }

    public LinkedList[] virita(Verkko verkko, int aloitussolmu) {



        etaisyys = new int[verkko.getVieruslista().length];
        parent = new int[verkko.getVieruslista().length];
        pieninVirittavaPuu = new LinkedList[verkko.getVieruslista().length];
        
        for(int a=0; a<verkko.getVieruslista().length;a++){
            pieninVirittavaPuu[a] = new LinkedList();
        }

       

        Minimikeko minimikeko = new Minimikeko(verkko.getVieruslista().length);

        for (int i = 0; i < etaisyys.length; i++) {

            etaisyys[i] = 999; 
            parent[i] = -1;


        }
        etaisyys[aloitussolmu] = 0;

        for (int i = 0; i < verkko.getVieruslista().length; i++) {

            minimikeko.heapInsert(i, etaisyys[i]);

        }
        System.out.println("minimikeko: ");
        System.out.print(minimikeko);
        
        while (minimikeko.getHeapSize() != 0) {
            int kasiteltavaSolmu = minimikeko.heapDelMin();
            int kaaripaino = 0;
            
            System.out.println("Käsiteltävä solmu:" + kasiteltavaSolmu);
            
            if (parent[kasiteltavaSolmu] != -1) {
                for (int k = 0; k < verkko.getVieruslista()[kasiteltavaSolmu].size(); k++) {
                    Solmu vierussolmu = (Solmu) verkko.getVieruslista()[kasiteltavaSolmu].get(k);
                    if (vierussolmu.getSolmunNumero() == parent[kasiteltavaSolmu]) {
                        kaaripaino = vierussolmu.getKaaripaino();

                    }
                }
                Solmu ekaSolmu = new Solmu(parent[kasiteltavaSolmu], kaaripaino);
                Solmu tokaSolmu = new Solmu(kasiteltavaSolmu, kaaripaino);

                pieninVirittavaPuu[kasiteltavaSolmu].add(ekaSolmu);
                pieninVirittavaPuu[parent[kasiteltavaSolmu]].add(tokaSolmu);
            }
            for (int i = 0; i < verkko.getVieruslista()[kasiteltavaSolmu].size(); i++) {
                Solmu solmu = (Solmu) verkko.getVieruslista()[kasiteltavaSolmu].get(i);
                if (minimikeko.solmuOnKeossa(solmu.getSolmunNumero())
                        && solmu.getKaaripaino() < etaisyys[solmu.getSolmunNumero()]) {

                    parent[solmu.getSolmunNumero()] = kasiteltavaSolmu;
                    etaisyys[solmu.getSolmunNumero()] = solmu.getKaaripaino();
                    
                    System.out.println("Solmu:" + solmu.getSolmunNumero() + " kaaripaino:" + solmu.getKaaripaino());
                    
                    minimikeko.heapDecKey(solmu.getSolmunNumero(), etaisyys[solmu.getSolmunNumero()]);
                    
                    System.out.println("minimikeko: ");
                    System.out.print(minimikeko);
                    System.out.println("pienin kaari:" + minimikeko.heapMin());
                }
            }

        }



        return pieninVirittavaPuu;
    }
}
