package com.mycompany.doc_isavailable;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eber
 */
public class Paciente {
    
    public static List<Paciente> pacientes;
    private Integer id;
    private String nombre;
    
    public Paciente(Integer id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    public Paciente(){}
    
    public void darDeAltaP(){
        Scanner lector = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa el nombre: ");
        nombre = lector.nextLine();
        
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
}
