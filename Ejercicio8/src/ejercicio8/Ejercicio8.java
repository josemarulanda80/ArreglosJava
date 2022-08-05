/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        final int number=8,position,num;
        float [] numbers= new float[10];
        
        for(int i=0;i<number;i++){
             numbers[i]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los numeros por favor"));
        }
        System.out.println("Ingresa la posición");
        position= entry.nextInt();
        System.out.println("Ingresa el numero cambiado");
        num= entry.nextInt();
        
        for(int i=7;i>=position;i--){
            numbers[i+1]=numbers[i];
        }
        numbers[position]=num;
        
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
        
    }
    
}
