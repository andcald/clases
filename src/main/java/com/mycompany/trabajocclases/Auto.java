/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajocclases;

/**
 *
 * @author CP-16
 */
public class Auto {

    String placa;
    String marca;
    int anio;
    String color;
    double precio;
    int cilindrajeMotor;
    Propietario owner;
    lugarMatricula lugarM;

    public String mostrarInfo() {
        var retorno = "El auto tiene placa: " + this.placa + " es marca: " + this.marca
                + "  El año del auto es: " + this.anio + " el dueño es " + this.owner.nombre
                + " la direccion es " + this.owner.direccion+
"El carro se matriculo en:  " + this.lugarM.provincia  + ", " + this.lugarM.ciudad+ " en el centro de matriculacion: "
               + this.lugarM.descripcion +"  y el dueño es : "+this.owner.nombre;
        return retorno;
    }
}
