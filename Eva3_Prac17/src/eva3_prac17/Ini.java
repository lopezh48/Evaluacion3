/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_prac17;

import java.util.Scanner;

/**
 *
 * @author ascr4
 */
public class Ini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dat=new int[20];
        llenar(dat);
        mostrar(dat);
        
        /*long ini, fin;
        ini= System.nanoTime();
        selectSort(dat);
        fin= System.nanoTime();
        mostrar(dat);
        System.out.println("Tiempo = "+(fin-ini));
        
        llenar(dat);
        mostrar(dat);
        
        ini= System.nanoTime();
        inserSort(dat);
        fin= System.nanoTime();
        mostrar(dat);
        System.out.println("Tiempo= "+(fin-ini));
        
        llenar(dat);
        mostrar(dat);
        
        ini= System.nanoTime();
        Burbuja(dat);
        fin= System.nanoTime();
        mostrar(dat);
        System.out.println("Tiempo= "+(fin-ini));*/
        selectSort(dat);
        mostrar(dat);
        System.out.println("Que elemento quieres buscar");
        Scanner l=new Scanner(System.in);
        int val=l.nextInt();
        System.out.println("Posicion: "+busquedaBin(dat,val));
    }
    public static void llenar(int [] arre){
        for (int i = 0; i < arre.length; i++) {
            arre[i]=(int)(Math.random()*100);
        }
    }
    public static void mostrar(int []arre){
        for (int i = 0; i < arre.length; i++) {
            System.out.print("["+arre[i]+"]");
        }
        System.out.println("");
    }
    //Hace mas comparaciones, menos intercambios
    public static void selectSort(int []arre){
        for (int i = 0; i < arre.length-1; i++) {
            int Min=i, temp;
            for (int j = i+1; j < arre.length; j++) {
                if(arre[Min]>arre[j]){
                    Min=j;
                }
            }
            //Intercambio equivalente
            temp=arre[i];
            arre[i]=arre[Min];
            arre[Min]=temp;
        }
    }
    //Hace menos comparaciones, mas intercambios
    public static void inserSort(int []arre){
        for (int i = 1; i < arre.length; i++) {
            int temp=arre[i];
            int insP;
            for (insP = i; insP > 0; insP--) {
                int prev=insP-1;
                if(arre[prev]>temp){
                    //Intercambio equivalente
                    arre[insP]=arre[prev];
                }else {
                    break;
                }
            }
            arre[insP]=temp;
        }
    }
    public static void Burbuja(int[]arre){
        for (int i = 0; i < arre.length; i++) {
            for (int j = 0; j < arre.length-1; j++) {
                if(arre[j]>arre[j+1]){
                    int Temp=arre[j];
                    arre[j]=arre[j+1];
                    arre[j+1]=Temp;
                }
            }
        }
    }
    public static void quickSort(int[]arre){
        
    }
    public static int busquedaBin(int[]arre, int val){
        return busquedaBinRec(arre, val, 0, arre.length-1);
    }
    private static int busquedaBinRec(int[]arre, int val, int ini, int fin){
        if(ini<=fin){
            int mid = ini + ((fin -ini ) / 2);
            if (val == arre[mid]) {
                return mid;
            } else if (val > arre[mid]) {//Mayor
                return busquedaBinRec(arre, val, mid + 1, fin);
            } else {//Menor
                return busquedaBinRec(arre, val, ini, mid - 1);
            }
        }else
            return -1;
    }
}
