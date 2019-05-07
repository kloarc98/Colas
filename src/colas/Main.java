/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;
import javax.swing.JOptionPane;
/**
 *
 * @author alumno
 */
public class Main {
    public static Colas Cola;
     
    public static void main(String[] ARGUMENTOS)
    {    
        int MAX;
 
        MAX = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL TAMAÑO DE LA COLA"));   
        Cola = new Colas(MAX); 
        MenuCola();
    }
     
    public static void MenuCola()
    {
        int Opcion;
         
        do
        {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n"+
                    "2. ELIMINAR DATOS\n"+
                    "3. OBSERVAR DATOS\n"+
                    "4. VACIAR COLA\n"+
                    "5. SALIR\n"+
                    "--------------------------------------------------------\n"+
                    "INGRESE LA OPCION [1 - 5]","MENU COLA",JOptionPane.QUESTION_MESSAGE));
             
            switch(Opcion)
            {
                case 1: Cola.InsertarCola();break;
                case 2: Cola.EliminarCola();break;
                case 3: Cola.MostrarCola();break;
                case 4: Cola.VaciarCola();break;
                case 5: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }
        while(true); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 5
    }
    
}
