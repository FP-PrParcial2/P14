/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema014;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x[][];
       x=new int [7][7];
       
       int p;
        for(int i=0;i<x.length;i++){ 
        for(int j=0;j<x.length;j++){
            if(i==j){ 
                 p=1;
                }else{
                p=0;
                }
            System.out.print(p +"\t");
            }
            System.out.println("\n");
        }
    }
}

