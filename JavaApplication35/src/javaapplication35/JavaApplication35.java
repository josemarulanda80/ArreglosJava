/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros={1,2,3,4};
        
        for (int i=0;i<4;i++){
            System.out.println(numeros[i]);
            
        }
        Scanner entry= new Scanner(System.in);
        
        int nElements= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
        
        char[] letras = new char[nElements];
        
        //LLenar elementos de un for
        for (int i=0;i<nElements;i++){
            System.out.println("Ingrese el caracter a ingresar");
            
            letras[i]=entry.next().charAt(0);
        }
        //el for each para recorrer un arreglo
        
         String[]  nombres={"Alejadnro","Maria","luisa","Juan"};
         
         for (String i:nombres){
             System.out.println(i);
         }
        
    }
    
    
    
}
