package com.mycompany.doc_isavailable;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eber
 */
public class Medico {
    public static List<Medico> medicos;
    private Integer id;
    private String nombre;
    private String especialidad;

    public Medico(Integer id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public Medico() {
    }

    public void darDeAltaM() {
        Scanner lector = new Scanner(System.in);
        String nombre;
        String especialidad;
        System.out.println("Ingresa el nombre: ");
        nombre = lector.nextLine();
        System.out.println("Ingresa su especialidad: ");
        especialidad = lector.nextLine();
        
        System.out.println("El registro ha sido creado!");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
