/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronnie
 */
import java.util.*;

public class Main {
    //testataanpa

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Verkko testiverkko = new Verkko();
        Prim prim = new Prim();
        LinkedList[] ViritettyPuu;

        for (int k = 0; k < testiverkko.getSolmutaulukko().length; k++) {

            System.out.print(testiverkko.getSolmutaulukko()[k]);
        }
        long aloitusAika = System.currentTimeMillis();
        ViritettyPuu = prim.virita(testiverkko, 0);
        long lopetusAika = System.currentTimeMillis();

        System.out.println(ViritettyPuu.toString());
        

        for (int k = 0; k < ViritettyPuu.length; k++) {

            System.out.print(ViritettyPuu[k]);
        }
        System.out.println();
        System.out.println("Suoritusaika primille on "+ (lopetusAika-aloitusAika)+"ms.");
        /*
         *
         * int i = 3; int j = 2; System.out.println("testi:"+ i/j);
         *
         * Minimikeko minikeko = new Minimikeko(); minikeko.heapInsert(4);
         * minikeko.heapInsert(2); minikeko.heapInsert(1);
         * minikeko.heapInsert(7); minikeko.heapInsert(6);
         * System.out.println(minikeko); minikeko.heapDelMin();
         * System.out.println(minikeko); minikeko.heapDecKey(3, 1);
         * System.out.println(minikeko); System.out.println("Minimi on " +
         * minikeko.heapMin());
         *
         *
         */


    }
}
