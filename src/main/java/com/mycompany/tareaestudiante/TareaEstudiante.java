/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaestudiante;

/**
 *
 * @author USUARIO
 */
public class TareaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", 16, 1, "Software", null);
        estudiante1.mostrarInformacion();

        Estudiante estudiante2 = new Estudiante("Martha", 19, 5, "Mecanica", "martha@espe.edu.ec");
        estudiante2.mostrarInformacion();

        Estudiante estudiante3 = new Estudiante("Carlos", 17, 3, "Electronica", null);
        estudiante3.mostrarInformacion();

        Estudiante estudiante4 = new Estudiante("Patricia", 20, 8, "Petroquimica", "patty@espe.edu.ec");
        estudiante4.mostrarInformacion();
    }
}
