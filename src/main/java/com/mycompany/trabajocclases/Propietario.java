/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajocclases;

/**
 *
 * @author CP-16
 */
public class Propietario {
    String nombre;
    String telefono;
    String direccion;
    int anioNacimiento;
    
    
     public int getEdad(int anioActual) {
        var retorno = 0;
        retorno = anioActual - this.anioNacimiento;
        return retorno;
    }
    
    
    public String mostrarInfo() {
        
        var retorno = "El propietario se llama : " + this.nombre + " su telefono es  " + this.telefono + " la direccion es  "
                + this.direccion + "  El año del auto es: " + this.getEdad(2022);

        return retorno;
    }
}
