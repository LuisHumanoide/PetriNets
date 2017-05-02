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
public class LambdaPrima {
    Fr fr;
    int Tindex;
    int idFr;
    
    public LambdaPrima(Fr fr, int index, int idFr){
        this.fr = fr;
        this.Tindex = index;
        this.idFr = idFr;
    }
    
    public int getTindex(){
        return Tindex;
    }
    
    public int getIdFr(){
        return idFr;
    }
    
    public Fr getFr(){
        return fr;
    }
}
