package TiratJaAlgot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronnie
 */
public class Kaari {
    private int u,v,kaaripaino;
    
    public Kaari(int u, int v, int kaaripaino){
        this.u =u;
        this.v = v;
        this.kaaripaino = kaaripaino;
    }
    public void setU(int u){
        this.u = u;
    }
    public void setV(int v){
        this.v = v;
    }
    public void setKaaripaino(int kaaripaino){
        this.kaaripaino = kaaripaino;
    }
    
    public int getU(){
        return u;
        
    }
    public int getV(){
        return v;
    }
    
    public int getKaaripaino(){
        return kaaripaino;
    }
    
}
