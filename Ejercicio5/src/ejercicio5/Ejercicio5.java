/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     final int number=10;
        float [] numbers= new float[number];
        float [] numbers2= new float[number];
        float [] numbers3= new float[number*2];
        
        for(int i=0;i<number;i++){
             numbers[i]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los numeros para el primer vector"));
             numbers2[i]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los numeros para el segundo vector"));
        }
        
        
        for(int i=0;i<10;i++){
            
 
                System.out.println("p");
                System.out.println(i);
                numbers3[i*2]=numbers[i];
                numbers3[(i*2)+1]=numbers2[i];
 
            
        }
        for (int i=0;i<20;i++){
           System.out.println(numbers3[i]);
        }
    
        
        
     
        
    }
    
}
