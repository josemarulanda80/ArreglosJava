/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientosinserción;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class OrdenamientosInserción {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[]={4,3,2,1};
        
        int dato,dato2=0;
        boolean band = false;
        
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato a buscar") );
        
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==dato){
                dato2=i;
                JOptionPane.showMessageDialog(null, "lo encontramos en el  indice "+i);
                
            }
        
        
            
            
        }
        
        
    }
    
}
