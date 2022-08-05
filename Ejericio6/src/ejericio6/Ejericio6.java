/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericio6;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejericio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             final int number=10;
        float [] numbers= new float[number];
        float [] numbers2= new float[number];
        float [] numbers3= new float[number*2];
        
        for(int i=0;i<number;i++){
             numbers[i]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los numeros para el primer vector"));
             numbers2[i]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los numeros para el segundo vector"));
        }
        
      
      
    
    }
    
}
