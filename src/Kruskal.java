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
    
    private ArrayList<LinkedList> solmutaulukko = new ArrayList<>();
    private ArrayList<LinkedList> apusolmutaulukko = new ArrayList<>();
    private LinkedList<Solmu> vieruslista = new LinkedList();
    Solmu solmu,solmu2;
    
    public Kruskal(Verkko verkko){
        this.verkko = verkko;
        
        
        
    }
    public ArrayList virita(){
        
      
      
        
        
        return solmutaulukko;
        
    }
    private void vaihtoJarjesta(ArrayList<LinkedList> taulukko){
        
        for (int i=0; i < taulukko.size(); i++){
            for (int j = i+1; j < taulukko.size(); j++){
                solmu = (Solmu) taulukko.get(i).get(i);
                solmu2 = (Solmu) taulukko.get(j).get(j);
                if (solmu.getKaaripaino() > solmu2.getKaaripaino()){
                    
                }
            }
        }
    }
}
