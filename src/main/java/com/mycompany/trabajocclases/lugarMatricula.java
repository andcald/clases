/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajocclases;

/**
 *
 * @author CP-16
 */
public class lugarMatricula {
    String provincia;
    String ciudad;
    String descripcion;
    Auto lugarMatricula;
    
      public String mostrarInfo() {
        
        var retorno = "El carro se matriculo en:  " + this.provincia  + ", " + this.ciudad + " en el centro de matriculacion: "
                + this.descripcion +" el auto es: "+ this.lugarMatricula.marca+" y el dueño es : "+this.lugarMatricula.owner.nombre;

        return retorno;
    }
    
}
