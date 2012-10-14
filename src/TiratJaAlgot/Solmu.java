package TiratJaAlgot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronnie
 */
public class Solmu {
    
    private int kaaripaino;
    private int solmunNumero;
  
    /**
     * Luo uuden vieruslistan solmun, joka tuntee oman numeronsa ja kaaripainon vanhempaansa.
     * @param solmunNumero
     * @param kaaripaino 
     */
    public Solmu(int solmunNumero, int kaaripaino){
        this.kaaripaino = kaaripaino;
        this.solmunNumero = solmunNumero;
        
    }
    public int getKaaripaino(){
        return kaaripaino;
        
    }
    public int getSolmunNumero(){
        return solmunNumero;
    }
    
    @Override
    public String toString(){
        return ("(" +solmunNumero+ ", "+ kaaripaino+ ")");
    }
    
}
