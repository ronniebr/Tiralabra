package Tietorakenteet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronnie
 */

public class Verkko {
    

   private Solmu[][] taulu;

  /**
   * Luo oletusverkon (Tietorakenteet kurssin luentomateriaalin mukainen).
   */
    public Verkko(){
        
        taulu = new Solmu[5][5];
        
        lisaaKaari(0,1,7);
        lisaaKaari(0,2,8);
        lisaaKaari(0,3,4);
        lisaaKaari(1,4,1);
        lisaaKaari(2,3,2);
        lisaaKaari(3,1,1);
        lisaaKaari(3,4,6);
        
       
        
    }
    /**
     * Luo uuden verkon ja asettaa matriisin oikean kokoiseksi annetun solmujen lukumäärän perusteella.
     * Oletetaan, että kahden solmun välissä voi olla vain yksi kaari.
     * @param solmujenlkm 
     */
    public Verkko(int solmujenlkm){
        taulu = new Solmu[solmujenlkm][solmujenlkm];

    }
    /**
     * Lisää verkkoon kaaren (lahtoSolmu,loppuSolmu) annetulla kaaripainolla.
     * Huom! Lisää yhteyden molempiin suuntiin, eli mahdollista luoda vain yhtenäinen painotettu verkko.
     * @param lahtoSolmu
     * @param loppuSolmu
     * @param kaaripaino 
     */
    public final void lisaaKaari(int lahtoSolmu, int loppuSolmu, int kaaripaino){
        int i =0;
        int j =0;
        while(taulu[lahtoSolmu][i] != null){
            i++;
        }
         while(taulu[loppuSolmu][j] != null){
            j++;
        }
        taulu[lahtoSolmu][i] = new Solmu(loppuSolmu,kaaripaino);
        taulu[loppuSolmu][j] = new Solmu(lahtoSolmu,kaaripaino);
        
    }
 
    public Solmu[][] getVieruslista(){
        return taulu;
    }
    
    @Override
    public String toString(){
        System.out.println();
        for(int i=0;i<taulu.length;i++){
            System.out.print("[");
            int j=0;
            while(taulu[i][j] != null){
                System.out.print(taulu[i][j]+",");
                j++;
                       
            }
            System.out.print("]");
        }
        
        return"";
        
    }
    
  
}
