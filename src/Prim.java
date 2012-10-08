
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

    //private taulukko kaaret;
    //private minimikeko solmut; 
    //private aputaulukko etaisyys;
    //private aputaulukko vanhempi;
    private int aloitussolmu;
    private Verkko verkko;
    private int[] etaisyys = new int[10];
    private int[] parent = new int[10];
    private LinkedList[] solmutaulu = new LinkedList[5];
    private LinkedList<Solmu> vieruslista = new LinkedList();
    private LinkedList<Solmu> vieruslista2 = new LinkedList();
    private LinkedList<Solmu> vieruslista3 = new LinkedList();
    private LinkedList<Solmu> vieruslista4 = new LinkedList();
    private LinkedList<Solmu> vieruslista5 = new LinkedList();
    private LinkedList<Solmu> vieruslista6 = new LinkedList();
    
    public Prim(){
        
    }

    public LinkedList[] virita(Verkko verkko, int aloitussolmu) {
        solmutaulu[0] = vieruslista;
        solmutaulu[1] = vieruslista2;
        solmutaulu[2] = vieruslista3;
        solmutaulu[3] = vieruslista4;
        solmutaulu[4] = vieruslista5;
        //solmutaulu[5] = vieruslista6;
        
        this.verkko = verkko;
        this.aloitussolmu = aloitussolmu;
        Minimikeko minimikeko = new Minimikeko();

        for (int i = 0; i < etaisyys.length; i++) {

            etaisyys[i] = 999; //placeholder
            parent[i] = -1;


        }
        etaisyys[aloitussolmu] = 0;

        for (int i = 0; i < verkko.getSolmutaulukko().length; i++) {
            
            minimikeko.heapInsert(i, etaisyys[i]);
            
        }
        System.out.println("minimikeko: ");
        System.out.print(minimikeko);
        while (minimikeko.getHeapSize() != 0) {
            int u = minimikeko.heapDelMin();
            int kaaripaino = 0;
            System.out.println("Käsiteltävä solmu:" + u);
            if (parent[u] != -1) {
                for (int k = 0; k < verkko.getSolmutaulukko()[u].size(); k++) {
                    Solmu vanhaSolmu = (Solmu) verkko.getSolmutaulukko()[u].get(k);
                    if (vanhaSolmu.getSolmunNumero() == parent[u]) {
                        kaaripaino = vanhaSolmu.getKaaripaino();

                    }
                }
                Solmu ekaSolmu = new Solmu(parent[u], kaaripaino);
                Solmu tokaSolmu = new Solmu(u, kaaripaino);

                solmutaulu[u].add(ekaSolmu);
                solmutaulu[parent[u]].add(tokaSolmu);
            }
            for (int i = 0; i < verkko.getSolmutaulukko()[u].size(); i++) {
                Solmu solmu = (Solmu) verkko.getSolmutaulukko()[u].get(i);
                if (minimikeko.solmuOnKeossa(solmu.getSolmunNumero())
                        && solmu.getKaaripaino() < etaisyys[solmu.getSolmunNumero()]) {

                    parent[solmu.getSolmunNumero()] = u;
                    etaisyys[solmu.getSolmunNumero()] = solmu.getKaaripaino();
                    System.out.println("Solmu:" + solmu.getSolmunNumero() + " kaaripaino:" + solmu.getKaaripaino());
                    //System.out.println(minimikeko);
                    minimikeko.heapDecKey(solmu.getSolmunNumero(), etaisyys[solmu.getSolmunNumero()]);
                    System.out.println("minimikeko: ");
                    System.out.print(minimikeko);
                    System.out.println("pienin kaari:" + minimikeko.heapMin());
                }
            }

        }



        return solmutaulu;
    }
}
