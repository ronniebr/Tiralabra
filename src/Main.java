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

        Verkko testiverkko = new Verkko();
        
        Prim prim = new Prim();
       Verkko ViritettyPuu;
        
 
         
        System.out.println(testiverkko);

        long aloitusAika = System.currentTimeMillis();
        ViritettyPuu = prim.virita(testiverkko, 0);
        long lopetusAika = System.currentTimeMillis();


        System.out.println();
        System.out.println(ViritettyPuu);

        System.out.println();
        System.out.println("Suoritusaika primille on " + (lopetusAika - aloitusAika) + "ms.");



    }
}
