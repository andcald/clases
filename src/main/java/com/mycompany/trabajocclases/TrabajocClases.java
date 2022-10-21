/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajocclases;

/**
 *
 * @author CP-16
 */
public class TrabajocClases {

    public static void main(String[] args) {
        var propietario = new Propietario();

        propietario.nombre = "Andres";
        propietario.direccion = "Cuenca";
        propietario.telefono = "074108874";
        propietario.anioNacimiento = 1998;

        var propietario1 = new Propietario();
        propietario1.nombre = "Juan";
        propietario1.direccion = "Quito";
        propietario1.telefono = "074108874";
        propietario1.anioNacimiento = 1978;

        var auto1 = new Auto();
        auto1.marca = "Toyota";
        auto1.placa = "GDL0207";
        auto1.anio = 2016;
        auto1.color = "rojo";
        auto1.precio = 20000;
        auto1.cilindrajeMotor = 1600;
        auto1.owner = propietario1;

        var auto2 = new Auto();
        auto2.marca = "Chevrolet";
        auto2.placa = "ABL0207";
        auto2.anio = 2016;
        auto2.color = "rojo";
        auto2.precio = 20000;
        auto2.cilindrajeMotor = 1600;
        auto2.owner = propietario;

        var lugarMatricula = new lugarMatricula();
        lugarMatricula.ciudad = "Cuenca";
        lugarMatricula.descripcion = "Mayancela";
        lugarMatricula.provincia = "Azuay";
        lugarMatricula.lugarMatricula = auto2;
        
         var lugarMatricula1 = new lugarMatricula();
        lugarMatricula1.ciudad = "Quito";
        lugarMatricula1.descripcion = "Chillos";
        lugarMatricula1.provincia = "Pichincha";
        lugarMatricula1.lugarMatricula = auto1;

        System.out.println(auto1.mostrarInfo());
        System.out.println(auto2.mostrarInfo());

        System.out.println(lugarMatricula.mostrarInfo());
        System.out.println(lugarMatricula1.mostrarInfo());
    }
}
