/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.cancion;
import vista.mostrar;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class ejecucion {
    public static void main(String[] args) {
        cancion can=new cancion();
     
        
        
        
        //r1.colorLinea="Azul";
        can.setnombre("Torero");
        can.setcantante("Chayanne");
        can.setgenero("Salsa");
        can.setduracion(3.38);
        
        mostrar m1=new mostrar();
        
        m1.imprimir(can.getnombre(), can.getcantante(), can.getgenero(), can.getduracion());
        
        
    }
}
