package Main;

import Algoritmit.Prim;
import Algoritmit.Kruskal;
import Tietorakenteet.Verkko;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronnie
 */


public class Main {
    //testataanpa

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Verkko testiverkko = new Verkko(50,"random");
        
        Prim prim = new Prim();
        Verkko ViritettyPuuPrim;
        Kruskal kruskal = new Kruskal();
        Verkko ViritettyPuuKruskal;
        
        System.out.println(testiverkko);

        long aloitusAika = System.currentTimeMillis();
        ViritettyPuuPrim = prim.virita(testiverkko, 0);
        long lopetusAika = System.currentTimeMillis();
        
        long aloitusAika2 = System.currentTimeMillis();
        ViritettyPuuKruskal = kruskal.virita(testiverkko);
        long lopetusAika2 = System.currentTimeMillis();


        System.out.println();
        System.out.println("Prim "+ViritettyPuuPrim);
        System.out.println("Kruskal "+ViritettyPuuKruskal);

        System.out.println();
        System.out.println("Suoritusaika primille on " + (lopetusAika - aloitusAika) + "ms.");
        System.out.println("Suoritusaika kruskalille on " + (lopetusAika2 - aloitusAika2) + "ms.");



    }
}
