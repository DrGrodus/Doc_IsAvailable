
package com.mycompany.doc_isavailable;

import java.util.Scanner;

/**
 *
 * @author eber
 */
public class Cita {
    private Integer id;
    private String nombreCita;
    private String fecha;
    private Medico medico;
    private Paciente paciente;
    
    
    public Cita(Integer id, String nombreCita, String fecha, Medico medico, Paciente paciente){
        this.id = id;
        this.nombreCita = nombreCita;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
    }
    
    public Cita(){
        
    }
    
    public void crearCita(){
        Scanner lector = new Scanner(System.in);
        String fecha;
        String motivo;
        System.out.println("Especifica la fecha (23/07/21 o 23 de agosto del 2021): ");
        fecha = lector.nextLine();
        System.out.println("Define motivo: ");
        motivo = lector.nextLine();
        guardarCita(fecha, motivo);
    }
    
    public void mostrarCitas(){
        
    }   
    
    public void guardarCita(String fecha, String motivo){
    }
    

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCita() {
        return nombreCita;
    }

    public void setNombreCita(String nombreCita) {
        this.nombreCita = nombreCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
