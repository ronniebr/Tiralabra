
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
    private int[] etaisyys;
    
    private ArrayList<LinkedList> solmutaulukko = new ArrayList<>();
    private LinkedList vieruslista = new LinkedList();
    
    
    /*public Prim(verkko,kaaripainot,aloitussolmu){
    }
    * 
    */
    
    public Prim(Verkko verkko, int aloitussolmu){
        this.verkko = verkko;
        this.aloitussolmu = aloitussolmu;
        Minimikeko minimikeko = new Minimikeko();
        
        for(int i=0; i<etaisyys.length; i++){
            
            etaisyys[i] = 999; //placeholder
            
        }
        etaisyys[aloitussolmu] = 0;
        
        for (int i=0;i<verkko.getSolmutaulukko().size();i++){
            minimikeko.heapInsert(etaisyys[i]);
            
        }
        
        
 
        
    }
    
}



