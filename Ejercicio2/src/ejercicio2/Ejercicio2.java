/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int number=5;
        float [] numbers= new float[number];
        
        for(int i=0;i<number;i++){
             numbers[i]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los numeros por favor"));
        }
        
        for(int i=number-1;i>=0;i--){
            System.out.println(numbers[i]);
        }
    }
    
}
