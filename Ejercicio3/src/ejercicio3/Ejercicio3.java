/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       final int number =5;
       float[] numbers=new float[number];
        float promedioP=0;
        int contP = 0,contN=0;
        float promedioN=0;
        
        float numberZ=0;
       
        for(int i=0;i<number;i++){
             numbers[i]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los numeros por favor"));
             if (numbers[i]>0){
                 promedioP+=numbers[i];
                 contP++;
             }
             else{
                 if(numbers[i]<0){
                     promedioN+=numbers[i];
                     contN--;
                 }
                 else{
                     
                     numberZ++;
                 }
             }
        }
        
        JOptionPane.showMessageDialog(null, "el promedio positivos es: "+(promedioP/contP)+" El de negativos es de "+(promedioN/contN)+" la cantidad de ceros es "+numberZ);
        
    }
    
}
