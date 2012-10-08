/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronnie
 */
import java.util.*;
public class Verkko {
    
   // private ArrayList<LinkedList> solmutaulukko = new ArrayList<LinkedList>();
    private LinkedList[] solmutaulu = new LinkedList[5];
    private LinkedList<Solmu> vieruslista = new LinkedList();
    private LinkedList<Solmu> vieruslista2 = new LinkedList();
    private LinkedList<Solmu> vieruslista3 = new LinkedList();
    private LinkedList<Solmu> vieruslista4 = new LinkedList();
    private LinkedList<Solmu> vieruslista5 = new LinkedList();
    private LinkedList<Solmu> vieruslista6 = new LinkedList();
    private Solmu solmu = new Solmu(1,1);
    private Solmu solmu2 = new Solmu(3,4);
    private Solmu solmu3 = new Solmu(4,2);
    private Solmu solmu4 = new Solmu(5,6);
    private Solmu solmu5 = new Solmu(4,4);
    private Solmu solmu6 = new Solmu(1,7);
    private Solmu solmu7 = new Solmu(3,9);
    private Solmu solmu8 = new Solmu(5,1);
    public Verkko(){
        
        vieruslista.add(new Solmu(1,7));
        vieruslista.add(new Solmu(2,8));
        vieruslista.add(new Solmu(3,4));
       vieruslista2.add(new Solmu(0,7));
       vieruslista2.add(new Solmu(3,1));
       vieruslista2.add(new Solmu(4,1));
       vieruslista3.add(new Solmu(0,8));
       vieruslista3.add(new Solmu(3,2));
       vieruslista4.add(new Solmu(0,4));
       vieruslista4.add(new Solmu(1,1));
       vieruslista4.add(new Solmu(2,2));
       vieruslista4.add(new Solmu(4,6));
       vieruslista5.add(new Solmu(1,1));
       vieruslista5.add(new Solmu(3,6));
        /*vieruslista.add(solmu2);
        vieruslista2.add(solmu3);
        vieruslista3.add(solmu4);
        vieruslista3.add(solmu5);
        vieruslista4.add(solmu6);
        vieruslista5.add(solmu7);
        vieruslista6.add(solmu8);
        * 
        */
        
        
 /*       solmutaulukko.add(vieruslista);
        solmutaulukko.add(vieruslista2);
        solmutaulukko.add(vieruslista3);
        solmutaulukko.add(vieruslista4);
        solmutaulukko.add(vieruslista5);
        solmutaulukko.add(vieruslista6);
        * 
        */
        
        solmutaulu[0] = vieruslista;
        solmutaulu[1] = vieruslista2;
        solmutaulu[2] = vieruslista3;
        solmutaulu[3] = vieruslista4;
        solmutaulu[4] = vieruslista5;
        //solmutaulu[5] = vieruslista6;
        
        //System.out.println(solmutaulukko);
        //System.out.println(solmutaulu);
        //System.out.println("indeksitesti: "+ solmutaulukko.get(0));
        
    }
    public LinkedList[] getSolmutaulukko(){
        return solmutaulu;
    }
  
}
