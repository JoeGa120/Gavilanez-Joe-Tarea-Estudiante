/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaestudiante;

/**
 *
 * @author USUARIO
 */
public class Estudiante extends Persona {
    private int nivel;
    private String carrera;

    public Estudiante(String nombre, int edad, int nivel, String carrera, String email) {
        super(nombre, edad, email);
        this.nivel = nivel;
        this.carrera = carrera;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante (Nombre: " + getNombre() + ", Edad: " + (getEdad() != -1 ? getEdad() : "no definida") +
                ", Nivel: " + nivel + ", Carrera: " + carrera + ", Email: " + (getEmail() != null ? getEmail() : "no proporcionado") + ")");
    }
}
