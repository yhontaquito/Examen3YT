/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.examen3tlyr;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class ExamenYRTL {
    public void imprimir(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    
    }
public int[][] ejercicio06YRTL(int dimen, int NumInit){
          System.out.println("Ejercicio 6: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if ( j<i+1){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }   
              }contador=0;
          }
          return matriz;
     }
    
    public int[][] ejercicio09YRTL(int dimen, int NumInit){
          System.out.println("Ejercicio 9: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if (j>=dimen-(i+1)){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }    
    
    public int[][] ejercicio12YRTL(int dimensionX, int numInit){
        System.out.println("Ejercicio 12: ");
          int[][] matriz=new int[dimensionX][dimensionX];
          for (int i = 0; i < matriz.length ; i++) {
              for (int j = matriz[0].length-1; j>=0; j--) {
                  if (j>=i){
                      matriz[i][j] = numInit;
                      numInit++;
                     
                     }else{
                matriz[i][j]=-1;
                }
            }
        }
          return matriz;
     }
    public int[][] ejercicio26YRTL(int dimensionX, int numInit){
        System.out.println("Ejercicio n° 30");
        int[][] matriz=new int[dimensionX][dimensionX];
        for (int Prin = 0; Prin < dimensionX/2; Prin++) {
            for (int LDx = Prin; LDx <dimensionX-Prin-1; LDx++) {
                matriz[LDx][dimensionX-Prin-1]=numInit;
                numInit++;
            }
            for (int LIx =dimensionX-Prin-1; LIx>Prin; LIx--) {
                matriz[dimensionX-Prin-1][LIx]=numInit;
                numInit++;
            }
            for (int LXx =dimensionX-Prin-1 ; LXx>Prin; LXx--) {
                matriz[LXx][Prin]=numInit;
                numInit++;
             }
            for (int LSx = Prin; LSx<dimensionX-Prin-1; LSx++) {
                matriz[Prin][LSx]=numInit;
                numInit++;
            }
             
            if(dimensionX%2!=0){
                matriz[dimensionX/2][dimensionX/2]=numInit;
            }
            
        }
    return matriz;
    }
    public int[][] ejercicio30YRTL(int dimensionX, int numInit){
        System.out.println("Ejercicio 9: ");
          int[][] matriz=new int[dimensionX][dimensionX];
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if (j>=dimensionX-(i+1)){
                      matriz[i][j] = numInit;
                      numInit++;
                     }else{
                matriz[i][j]=-1;
                }
            } ;
        }
          return matriz;
     } 
    
    public void TodoYRTL(){
        ExamenYRTL or=new ExamenYRTL();
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese nuevamente la dimencion de la matriz: ");
        int dimen=leer.nextInt();
        System.out.println("Ingrese nuevamente el numero de inicio: ");
        int n=leer.nextInt();
        or.imprimir(or.ejercicio06YRTL(dimen, n));
        or.imprimir(or.ejercicio09YRTL(dimen, n));
        or.imprimir(or.ejercicio12YRTL(dimen, n));
        or.imprimir(or.ejercicio26YRTL(dimen, n));
        or.imprimir(or.ejercicio30YRTL(dimen, n));
    }
    public static void main(String[] args) {
        ExamenYRTL or=new ExamenYRTL();
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        System.out.println("Ingrese la dimencion de la matriz: ");
        int dimen=leer.nextInt();
        System.out.println("Ingrese el numero de inicio: ");
        int n=leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: or.imprimir(or.ejercicio06YRTL(dimen, n)); break;
            case 2: or.imprimir(or.ejercicio09YRTL(dimen, n)); break;
            case 3: or.imprimir(or.ejercicio12YRTL(dimen, n)); break;
            case 4: or.imprimir(or.ejercicio26YRTL(dimen, n)); break;
            case 5: or.imprimir(or.ejercicio30YRTL(dimen, n)); break;
            case 6: or.TodoYRTL(); break;
                   
            
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
            System.out.println("Ingrese la dimencion de la matriz: ");
            dimen=leer.nextInt();
            System.out.println("Ingrese el numero de inicio: ");
            n=leer.nextInt();
        }
    }
}
    

