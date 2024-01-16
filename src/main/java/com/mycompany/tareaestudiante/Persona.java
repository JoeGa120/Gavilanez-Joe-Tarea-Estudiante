/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaestudiante;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private int edad;
    private String email;

    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public void mostrarInformacion() {
        System.out.println("Persona (Nombre: " + nombre + ", Edad: " + (edad != -1 ? edad : "no definida") + ", Email: " + (email != null ? email : "no proporcionado") + ")");
    }
}
