/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package block1;

/**
 *
 * @author yolanda
 */
public class FS {
    private int idFr;
    private float time;
    
    public FS(int idFr, float time){
        this.idFr = idFr;
        this.time = time;        
    }
    
    public void setIdFr(int idFr){
        this.idFr = idFr;
    }
    
    public int getIdFr(){
        return this.idFr;
    }
    
    public void setTime(float time){
        this.time = time;
    }
    
    public float getTime(){
        return this.time;
    }
    
    public int getIdF(){
        switch(this.idFr){
            case 0: return 0;
            case 1: return 1; 
            case 2: return 2; 
            case 3: return 3; 
            case 4: return 5; 
            case 5: return 6; 
            case 6: return 28; 
            case 7: return 33; 
            case 8: return 40; 
            case 9: return 51; 
        }
        return -1;
    }
    
}
