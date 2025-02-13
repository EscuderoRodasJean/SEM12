/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class cancion {
    //Atributos
    private String nombre;
    private String cantante;
    private String genero;
    private double duracion;
    
   //Metodo set
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setcantante(String cantante){
        this.cantante=cantante;
    }
     public void setgenero(String genero){
        this.genero=genero;
    }
     public void setduracion(double duracion){
        this.duracion=duracion;
    }
     
     //Metodo Get
     public String getnombre(){
         return this.nombre;
     }
     public String getcantante(){
         return this.cantante;
     }
     public String getgenero(){
         return this.genero;
     }
     public double getduracion(){
         return this.duracion;
     }
}
