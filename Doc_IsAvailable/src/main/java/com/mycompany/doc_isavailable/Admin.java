package com.mycompany.doc_isavailable;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eber
 */
public class Admin {
    public static Cita cita = new Cita();
    public static Medico medico = new Medico();
    public static Paciente paciente = new Paciente();
    
    public static List<Admin> admins;
    private Integer id;
    private String nombre;
    private String contrasena;
    private static Integer iA = 0;
    private static Integer iP = 0;
    private static Integer iM = 0;
    private static Integer iC = 0;

    public Admin() {
    }

    public Admin(Integer id, String nombre, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    // (cargar archivos)
    public void cargarDatos(){
        String archivoAdmins = "admins.json";
        String archivoPacientes = "pacientes.json";
        String archivoMedicos = "medicos.json";
        String archivoCitas = "citas.json";
        
        
        int id = iA;
        String nombre = "Juan";
        String contrasena = "1234";
        Admin admin = new Admin(id, nombre, contrasena);
        
        String jsonAdmins; String jsonPacientes; String jsonMedicos; String jsonCitas;
        Gson gson = new Gson();
        
        jsonAdmins = gson.toJson(admin);
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoAdmins));
            escritor.write(jsonAdmins);
            FileWriter filewriterA = new FileWriter(archivoAdmins);
            PrintWriter printwriterA = new PrintWriter(filewriterA);
            printwriterA.print(jsonAdmins);
            printwriterA.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        iA++; nombre = ""; contrasena = "";
        id = iA;
        nombre = "Paco";
        contrasena = "5678";
        admin = new Admin(id, nombre, contrasena);
        
        gson = new Gson();
        
        jsonAdmins = gson.toJson(admin);
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoAdmins));
            escritor.write(jsonAdmins);
            FileWriter filewriterA = new FileWriter(archivoAdmins);
            PrintWriter printwriterA = new PrintWriter(filewriterA);
            printwriterA.print(jsonAdmins);
            printwriterA.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        /**/
        
        nombre = "";
        id = iP;
        nombre = "Maria";
        
        Paciente paciente = new Paciente(id, nombre);
        
        gson = new Gson();
        
        jsonPacientes = gson.toJson(paciente);
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoPacientes));
            escritor.write(jsonPacientes);
            FileWriter filewriterP = new FileWriter(archivoPacientes);
            PrintWriter printwriterP = new PrintWriter(filewriterP);
            printwriterP.print(jsonPacientes);
            printwriterP.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        iP++; nombre = "";
        id = iP;
        nombre = "Carlos";
        
        paciente = new Paciente(id, nombre);
        
        gson = new Gson();
        
        jsonPacientes = gson.toJson(paciente);
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoPacientes));
            escritor.write(jsonPacientes);
            FileWriter filewriterP = new FileWriter(archivoPacientes);
            PrintWriter printwriterP = new PrintWriter(filewriterP);
            printwriterP.print(jsonPacientes);
            printwriterP.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        
        nombre = "";
        id = iM;
        nombre = "Luis";
        String especialidad = "General";
        
        Medico medico = new Medico(id, nombre, especialidad);
        
        gson = new Gson();
        
        jsonMedicos = gson.toJson(medico);
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoMedicos));
            escritor.write(jsonMedicos);
            FileWriter filewriterM = new FileWriter(archivoMedicos);
            PrintWriter printwriterM = new PrintWriter(filewriterM);
            printwriterM.print(jsonMedicos);
            printwriterM.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        iM++; nombre = "";
        id = iM;
        nombre = "Alberto";
        especialidad = "Cirugia";
        
        medico = new Medico(id, nombre, especialidad);
        
        gson = new Gson();
        
        jsonMedicos = gson.toJson(medico);
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoMedicos));
            escritor.write(jsonMedicos);
            FileWriter filewriterM = new FileWriter(archivoMedicos);
            PrintWriter printwriterM = new PrintWriter(filewriterM);
            printwriterM.print(jsonMedicos);
            printwriterM.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        
        id = iC;
        String nombreCita = "Cita1";
        String fecha = "23/07/21";
        Medico m = new Medico();
        Paciente p = new Paciente();
        
        Cita cita = new Cita((Integer) id, nombreCita, fecha, m, p);
        
        gson = new Gson();
        
        jsonCitas = gson.toJson(cita);
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoCitas));
            escritor.write(jsonCitas);
            FileWriter filewriterC = new FileWriter(archivoCitas);
            PrintWriter printwriterC = new PrintWriter(filewriterC);
            printwriterC.print(jsonCitas);
            printwriterC.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        id = iC;
        nombreCita = "Cita2";
        fecha = "23 de agosto del 2021";
        m = new Medico();
        p = new Paciente();
        
        cita = new Cita((Integer) id, nombreCita, fecha, m, p);
        
        gson = new Gson();
        
        jsonCitas = gson.toJson(cita);
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoCitas));
            escritor.write(jsonCitas);
            FileWriter filewriterC = new FileWriter(archivoCitas);
            PrintWriter printwriterC = new PrintWriter(filewriterC);
            printwriterC.print(jsonCitas);
            printwriterC.close();
        }catch(IOException e){
            System.out.println(e);
        }

    }
    
    public void leerDatos(BufferedReader Admins, BufferedReader Pacientes, BufferedReader Medicos, BufferedReader Citas){
        StringBuilder json = new StringBuilder();
        String str;
        try {
            // leer los admins
            while((str = Admins.readLine()) != null){
                System.out.println(str);
                json.append(str);
            }
            Gson gson = new Gson();
            Admin admins = gson.fromJson(json.toString(), Admin.class);
            
            
            // leer los pacientes
            StringBuilder json1 = new StringBuilder();
            str = "";
            while((str = Pacientes.readLine()) != null){
                System.out.println(str);
                json1.append(str);
            }
            Gson gson1 = new Gson();
            Paciente pacientes = gson1.fromJson(json1.toString(), Paciente.class);
            
            
            // leer los medicos
            StringBuilder json2 = new StringBuilder();
            str = "";
            while((str = Medicos.readLine()) != null){
                System.out.println(str);
                json1.append(str);
            }
            Gson gson2 = new Gson();
            Medico medicos = gson2.fromJson(json2.toString(), Medico.class);
            
            
            // leer las citas
            StringBuilder json3 = new StringBuilder();
            str = "";
            while((str = Citas.readLine()) != null){
                System.out.println(str);
                json1.append(str);
            }
            Gson gson3 = new Gson();
            Cita citas = gson1.fromJson(json3.toString(), Cita.class);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // (funcion para detectar a los admins)
    
    
    
    public boolean validarCredenciales(String nombre, String contrasena) {
        return admins.stream().anyMatch(x -> x.getNombre().equals(nombre) && x.getContrasena().equals(contrasena));
    }

    public void menu() {
        Scanner lector = new Scanner(System.in);
        int resp;
        System.out.println("1. Dar de alta a un medico\n"
                + "2. Dar de alta a un paciente\n"
                + "3. Crear una cita\n"
                + "4. Ver las citas guardadas\n"
                + "0. Salir\n");
        resp = lector.nextInt();
        switch (resp) {
            case 1:
                medico.darDeAltaM();
                break;
            case 2:
                paciente.darDeAltaP();
                break;
            case 3:
                cita.crearCita();
                break;
            case 4:
                
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                
                break;
        }
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
