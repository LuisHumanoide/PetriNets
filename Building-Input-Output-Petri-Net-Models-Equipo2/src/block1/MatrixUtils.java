/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package block1;

import java.util.ArrayList;

/**
 *
 * @author gamaa_000
 */
public class MatrixUtils
{
    /**
     * convierte el array list de soe a un arreglo de 2 dimensiones
     */
     public static int[][] OEStoMatrix(ArrayList<SOE> OES){
        int [][] matrix=new int[OES.get( 0 ).getArraySOE().array.length][OES.size()];
        for(int i=0;i<OES.size();i++){
            Integer[] array;
            array = OES.get(i).getArraySOE().array;
            for(int j=0;j<OES.get(i).getArraySOE().array.length;j++){
                matrix[j][i]=array[j];
            }
        }
        return matrix;    
    }
    
    public static String matrixToString(int[][] matrix){
        String cad="";
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                cad=cad+matrix[i][j]+" ";
            }
            cad=cad+"\n";
        }
        return cad;
    }
    
    public static int sizeOES(ArrayList<SOE> OES){
        int size=OES.get(0 ).getArraySOE().array.length;
        for(int i=0;i<OES.size();i++){
            if(i!=OES.get( i ).getArraySOE().array.length){
                size=-1;
                break;
            }
        }
        return size;     
    }
    
}
