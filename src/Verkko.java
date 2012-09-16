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
    
    private ArrayList<LinkedList> solmutaulukko = new ArrayList<LinkedList>();
    private LinkedList vieruslista = new LinkedList();
    private LinkedList vieruslista2 = new LinkedList();
    private LinkedList vieruslista3 = new LinkedList();
    private LinkedList vieruslista4 = new LinkedList();
    private LinkedList vieruslista5 = new LinkedList();
    private LinkedList vieruslista6 = new LinkedList();
    private Solmu solmu = new Solmu(2,1);
    private Solmu solmu2 = new Solmu(4,4);
    private Solmu solmu3 = new Solmu(5,2);
    private Solmu solmu4 = new Solmu(6,6);
    private Solmu solmu5 = new Solmu(5,4);
    private Solmu solmu6 = new Solmu(2,7);
    private Solmu solmu7 = new Solmu(4,9);
    private Solmu solmu8 = new Solmu(6,1);
    public Verkko(){
        vieruslista.add(solmu);
        vieruslista.add(solmu2);
        vieruslista2.add(solmu3);
        vieruslista3.add(solmu4);
        vieruslista3.add(solmu5);
        vieruslista4.add(solmu6);
        vieruslista5.add(solmu7);
        vieruslista6.add(solmu8);
        
        solmutaulukko.add(vieruslista);
        solmutaulukko.add(vieruslista2);
        solmutaulukko.add(vieruslista3);
        solmutaulukko.add(vieruslista4);
        solmutaulukko.add(vieruslista5);
        solmutaulukko.add(vieruslista6);
        
        System.out.println(solmutaulukko);
        
    }
  
}
