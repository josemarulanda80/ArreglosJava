/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication44;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class JavaApplication44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Metodo de ordenamiento
        
        Scanner entrada = new Scanner(System.in);
        int nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos"));
        int[] arreglo= new int[nElementos];
        int aux=0;
        
        for (int i = 0; i < nElementos; i++) {
            System.out.println("Ingrese el numero con el que desea jugar");
            arreglo[i]= entrada.nextInt();
        }
        
        //Metodo burbuja;
        for (int i = 0; i < nElementos-1; i++) {
            for (int j = 0; j < nElementos-1; j++) {
                if(arreglo[j]>arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                         
                }
                
            }
            
        }
        
       // mostrar arreglo de  forma creciente
       
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]);
            
        }
        
        // burbuja de modo decreciente
         for (int i = 0; i < nElementos-1; i++) {
            for (int j = 0; j < nElementos-1; j++) {
                if(arreglo[j]<arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                    
                }
                
            }
            
        }
         // mostrar arreglo de  forma decreciente
       
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]);
            
        }
        
    }
    
}
