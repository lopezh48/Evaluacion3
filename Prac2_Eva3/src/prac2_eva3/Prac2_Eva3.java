/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac2_eva3;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author ascr4
 */
public class Prac2_Eva3 {

    
    public static void main(String[] args) {
       LinkedList<Integer>  listin=new LinkedList();
        for (int i = 0; i < 15; i++) {
            listin.add((int)(Math.random()*100));
        }
        System.out.println(listin);
        
        Comparator c=new Comparator(){
           @Override
           public int compare(Object t, Object t1) {
               int resu;
               //Cero --> Igual
               //Psotivo --> Mayor
               //Negativo --> Menor
               Integer val,val1;
               val=(Integer)t;
               val1=(Integer)t1;
               
               resu=val1-val;
               
               return resu;
           }
            
        };
        
        listin.sort(c);
        System.out.println(listin);
        
        
        LinkedList<String> listaStr=new LinkedList();
        listaStr.add("Hola");
        listaStr.add(" ");
        listaStr.add("Mundo");
        listaStr.add(" ");
        listaStr.add("Cruel");
        listaStr.add("!!!");
        Comparator cmpStr=new Comparator(){
           @Override
           public int compare(Object t, Object t1) {
               String cade1=(String) t;
               String cade2=(String) t1;
               char c1=cade1.charAt(0);
               char c2=cade2.charAt(0);
               return c1-c2;
               
           }
            
        };
        System.out.println(listaStr);
        listaStr.sort(cmpStr);
        System.out.println(listaStr);
    }
    
}
