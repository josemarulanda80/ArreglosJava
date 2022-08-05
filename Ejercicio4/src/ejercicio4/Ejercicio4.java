/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int number=10;
        float [] numbers= new float[number];
        
        for(int i=0;i<number;i++){
             numbers[i]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los numeros por favor"));
        }
        
        for(int i=0,j=9;i<5 && j>=5;i++,j--){
            System.out.println(numbers[i]);
            System.out.println(numbers[j]);
        }
    
    }
    
}
